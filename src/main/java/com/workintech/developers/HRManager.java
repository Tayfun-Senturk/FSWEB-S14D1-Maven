package com.workintech.developers;

public class HRManager extends  Employee{
    private JuniorDeveloper[] Junior;
    private MidDeveloper[] Mid;
    private SeniorDeveloper[] Senior;

    public HRManager(long id,String name,int salary){
        super(id,name,salary);
    }
    @Override
    public void work(){
        System.out.println("HRManager starts to working");
    }
    public void addEmployee(int index,JuniorDeveloper j){
        if (index>Junior.length){
            System.out.println("Hata:index array length'den büyük");

        }else if (Junior[index]!=null){
            System.out.println("index dolu!");
        }else {
           Junior[index]=j;
        }
    }
    public void addEmployee(int index,MidDeveloper m){
        if (index>Mid.length){
            System.out.println("Hata:index array length'den büyük");

        }else if (Mid[index]!=null){
            System.out.println("index dolu!");
        }else {
            Mid[index]=m;
        }
    }
    public void addEmployee(int index,SeniorDeveloper s){
        if (index>Senior.length){
            System.out.println("Hata:index array length'den büyük");

        }else if (Senior[index]!=null){
            System.out.println("index dolu!");
        }else {
            Senior[index]=s;
        }
    }
}
