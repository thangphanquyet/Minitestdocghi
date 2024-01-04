import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        List<Material> gi = new ArrayList<>();
//        Material meat = new Meat("123", "dog meat", LocalDate.of(2023,12,30), 150000, 500.0);
//        Material meat1 = new Meat("124", "chicken meat", LocalDate.of(2023,12,30), 40000, 400.0);
//        Material meat2 = new Meat("125", "pig meat", LocalDate.of(2023,12,30), 120000, 550.0);
//        Material meat3 = new Meat("126", "cow meat", LocalDate.of(2023,12,30), 140000, 560.0);
//        Material meat4 = new Meat("127", "fish meat", LocalDate.of(2023,11,11), 130000, 420.0);
//        Material crispyFlour = new CrispyFlour("133", "bean powder", LocalDate.of(2024, 2, 10), 25000,600.0);
//        Material crispyFlour1 = new CrispyFlour("134", "fried dough", LocalDate.of(2024, 2, 11), 25000,600.0);
//        Material crispyFlour2 = new CrispyFlour("135", "crispy powder", LocalDate.of(2024,2 , 12), 25000,600.0);
//        Material crispyFlour3 = new CrispyFlour("136", "sweet bean powder", LocalDate.of(2024, 2, 13), 25000,600.0);
//        Material crispyFlour4 = new CrispyFlour("137", "milk powder", LocalDate.of(2024, 2, 14), 25000,600.0);
//        gi.add(meat);
//        gi.add(meat1);
//        gi.add(meat2);
//        gi.add(meat3);
//        gi.add(meat4);
//        gi.add(crispyFlour);
//        gi.add(crispyFlour1);
//        gi.add(crispyFlour2);
//        gi.add(crispyFlour3);
//        gi.add(crispyFlour4);
//        for (int i = 0; i < gi.size(); i++) {
//            if
//            LocalDate.now().isBefore()
////        }
//        for (Material m: gi){
//            if (m instanceof Meat){
//                double tong = m.cost*((Meat) m).weight;
//                if (LocalDate.now().isBefore(((Meat) m).getExpiryDate().minusDays(5))){
////                    double tong = m.cost*((Meat) m).weight;
////                    System.out.println("giam 30%");
//                    double giasaukhigiam = tong*0.7;
//                    System.out.println(giasaukhigiam +" giảm 30%");
//                } else {
////                    System.out.println("giâm 10%");
//                    double giagiamla = tong*0.9;
//                    System.out.println(giagiamla+ " giảm 10%");
//                }
//            } else {
//                if (m instanceof CrispyFlour){
//                    double tong = m.cost*((CrispyFlour) m).quantity;
//                    if (LocalDate.now().isBefore(((CrispyFlour) m).getExpiryDate().minusMonths(2))){
//                        double giagiamla1 = tong*0.6;
//                        System.out.println(giagiamla1 + " giá giảm 40%");
//                    }else if((LocalDate.now().isBefore(((CrispyFlour) m).getExpiryDate().minusMonths(4)))) {
//                        double giagiamla = tong*0.7;
//                        System.out.println(giagiamla + "giá giảm 40%");
//                    }else {
//                        double giagiamla = tong*0.95;
//                        System.out.println(giagiamla + "giảm 5%");
//                    }
//
//
//                }
//            }
//        }
//        // tính tổng
//        int tong = 0;
//        for (int i = 0; i < gi.size() ; i++) {
//            tong = tong + gi.get(i).getCost();
//        }
//        System.out.println("tổng tiền của 10 vật liệu là " + tong);
        Material meat = new Meat("123", "dog meat", LocalDate.of(2023,12,30), 150000, 500.0);
        Material meat1 = new Meat("124", "chicken meat", LocalDate.of(2023,12,30), 40000, 400.0);
        List<Material> list1 = new ArrayList<>();
//        list1.add(meat);
//        list1.add(meat1);
//
//        Main.writeFlie("data.txt",list1);



        list1 = Main.readFile("data.txt");
        for (Material m: list1){
            System.out.println(m);
        }
    }
    // ghi
    public static List<Material> readFile(String fileName) {
        File abc = new File(fileName);
        InputStream is = null;
        List<Material> list = new ArrayList<>();
        try {
            is = new FileInputStream(abc);
            ObjectInputStream ois = new ObjectInputStream(is);
            list = (List<Material>) ois.readObject();
            return list;

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    //
    public static void writeFlie(String fileName, List<Material> listName){
        File file = new File(fileName);
        try {
            OutputStream outputStream = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(outputStream);
            //ghi ra list ra
            oos.writeObject(listName);
            oos.close();
            outputStream.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}