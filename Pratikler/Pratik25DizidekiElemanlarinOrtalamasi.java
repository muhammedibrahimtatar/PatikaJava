package Pratik;

public class Pratik25DizidekiElemanlarinOrtalamasi {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5};
        int avarage = 0;

        for (int i = 0; i < list.length; i++) {
            avarage += list[i];
        }
        System.out.println("Ortalama:"+avarage/list.length);

    }
}
