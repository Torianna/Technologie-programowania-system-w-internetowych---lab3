import com.sun.security.auth.callback.TextCallbackHandler;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

//Klaudia Góralska
//33141

public class Main {

    public static void main(String[] args) {


        ///zadanie 1
        Set<String> week=new TreeSet<>();

        week.add("poniedzialek");
        week.add("wtorek");
        week.add("sroda");
        week.add("czwartek");
        week.add("piatek");
        week.add("sobota");
        week.add("niedziela");

        System.out.println(week);

        ////zadanie2

        Map<String, Teacher> nauczyciele = new HashMap<>();

        nauczyciele.put("Biologia",new Teacher("Jan", "Kowalski","siojdosidos"));
        nauczyciele.put("programowanie obiektowe",new Teacher("Michal", "Fedorov","siogggjdosidos"));
        nauczyciele.put("Matematyka",new Teacher("gggJan", "Kowgggalski","siojdosgggidos"));



        System.out.println(nauczyciele.get("programowanie obiektowe"));


        List<Student> student1=new ArrayList<>();
        List<Student> student2=new ArrayList<>();
        List<Student> student3=new ArrayList<>();

        student1.add(new Student("aaaaa","aaa","aaaa","aaa"));
        student1.add(new Student("bbbb","bbbb","bbbb","bbb"));
        student1.add(new Student("ccc","ccc","ccc","cccc"));

        student2.add(new Student("aaaaa","aaa","aaaa","aaa"));
        student2.add(new Student("bbbb","bbbb","bbbb","bbb"));
        student2.add(new Student("ccc","ccc","ccc","cccc"));

        student3.add(new Student("aaaaa","aaa","aaaa","aaa"));
        student3.add(new Student("bbbb","bbbb","bbbb","bbb"));
        student3.add(new Student("ccc","ccc","ccc","cccc"));


        Map<String, List<Student>> studenty = new HashMap<>();
        studenty.put("31A",student1);
        studenty.put("32",student2);
        studenty.put("31C",student3);

        System.out.println(studenty.get("32").toString());

        List <Product> lista = new ArrayList<>();


        try(BufferedReader in = new BufferedReader(new FileReader("produkty.txt"))) {

            String s = in.readLine();

            while(s!=null) {
                String [] produkt = s.split(";");
                int id= Integer.parseInt(produkt[0]);
                String name = produkt[2];
                float price= Float.parseFloat(produkt[3]);
                Product product = new Product(id,produkt[1], price,produkt[2] );
                lista.add(product);

                s = in.readLine();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }


        Map<Integer,Product> idki = new HashMap<>();
        Map<String, List<Product>> kategorie = new HashMap<>();

        for(Product p : lista){
            idki.put(p.getNumber(), p);

            if(kategorie.containsKey(p.getCategory())){
                List<Product> productList= kategorie.get(p.getCategory());
                productList.add(p);
                kategorie.replace(p.getCategory(),productList);

            }
            else{
                kategorie.put(p.getCategory(), new ArrayList<Product>());
                    List<Product> productList=kategorie.get(p.getCategory());
                    productList.add(p);
                    kategorie.replace(p.getCategory(),productList);
                }
            }
        }

}
