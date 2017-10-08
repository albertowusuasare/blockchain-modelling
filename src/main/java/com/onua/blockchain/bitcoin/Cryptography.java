package com.onua.blockchain.bitcoin;


import java.security.*;

public class Cryptography {
     Generator generator = new Generator(EllipticCurveAlgorithm.RSA);

    public Cryptography() throws NoSuchAlgorithmException {

    }


    public boolean isSignatureValid(byte[] incomingSignature, String publicKey) throws NoSuchAlgorithmException, SignatureException {
        Signature signature = Signature.getInstance("SHA1withRSA");
        signature.update(incomingSignature);
//        return signature.verif

        return false;
    }


    private  class Generator{
        private final int PUBLIC_KEY_LENGTH = 256;
        private final KeyPairGenerator keyPairGenerator;

        Generator(EllipticCurveAlgorithm ellipticCurveAlgorithm) throws NoSuchAlgorithmException {
            this.keyPairGenerator = KeyPairGenerator.getInstance(ellipticCurveAlgorithm.toString());
        }

        KeyPair createKeyPair(){
            return this.keyPairGenerator.generateKeyPair();
        }
    }

    private enum EllipticCurveAlgorithm{
        RSA("RSA");

        private String algorithmName;

        EllipticCurveAlgorithm(String algorithmName){
            this.algorithmName = algorithmName;
        }

        @Override
        public String toString(){
            return this.algorithmName;
        }
    }

}
