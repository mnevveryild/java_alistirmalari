package OOP;

public class bolum4 {

    int modelYear;
    String modelName;

    public bolum4(String modelName){
        this(2020,modelName);



    }

    public bolum4(int modelYear,String modelName){

        this.modelYear=modelYear;
        this.modelName=modelName;
    }

    public void printInfo(){
        System.out.println(modelYear + " " + modelName);
    }



}

