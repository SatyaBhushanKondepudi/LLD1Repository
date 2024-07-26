package org.bhushan.lld120072024.LLD1_Class3.village;

public class Family {
    private String privateAttribute ; // only this class
    Integer defaultAttribute ; // this class , children in this package
    protected boolean protectedAttribute ; // this class , children in & outside package
    public String publicAttribute ; // everywhere

    // All are accessible with in this class
    private void checkAccess(){
        System.out.println(privateAttribute);
        System.out.println(defaultAttribute);
        System.out.println(protectedAttribute);
        System.out.println(publicAttribute);
    }

    private class subFamily{

        // class with in a class also able to access all the variables
        private void checkAccess(){
            System.out.println(privateAttribute);
            System.out.println(defaultAttribute);
            System.out.println(protectedAttribute);
            System.out.println(publicAttribute);
        }
    }
}
