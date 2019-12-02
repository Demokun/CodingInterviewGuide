import java.util.*;
public class Question4 {
    ArrayList<Pet> arrayList = new ArrayList<>();
    public void add(Pet p){
        arrayList.add(p);
    }
    public ArrayList<String> pollAll(){
        ArrayList result = new ArrayList();
        for(int i = arrayList.size() - 1;i >= 0;i --){
            //TODO
        }
        return  result;
    }
    public void pollDog(){

    }
    public void pollCat(){

    }
    public boolean isEmpty(){
        return false;

    }
    public boolean isDogEmpty(){
        return false;

    }
    public boolean isCatEmpty(){
        return false;

    }
}
