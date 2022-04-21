package day09_ifElseStatement;

public class ChooseLanguage {

    public static void main(String[] args) {
        int selection=3;

    //selection1=hello, thank you for calling
        //selection 2= merhaba, aradiginiz icin tesekkurler
        //selection 3= hola, gracias para llamar
        //selection 4= privet, spasibo sa vash svonok
        //selection 5= merci pour votre appel

        if(selection==1) {
            System.out.println("hello, thank you for calling");
        }
        else if( selection==2) {
            System.out.println("merhaba, aradiginiz icin tesekkur ederiz");
        }
        else if (selection==3) {
            System.out.println("hola, gracias para llamar");
        }
        else if (selection==4) {
            System.out.println("privet, spasibo sa vash svonok");
        }
        else{
            System.out.println("merci pour votre appel");
        }


    }
}
