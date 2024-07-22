package org.demo;

public class Dev {

    private computer com;

    /*
    public Dev(computer com){
        this.com=com;
    }

     */



   public void setcom(computer com) {
        this.com = com;
    }
    public computer getCom() {
        return com;
    }




    public void build(){

        System.out.println("creating awsome project");
        com.compiler();
    }
}
