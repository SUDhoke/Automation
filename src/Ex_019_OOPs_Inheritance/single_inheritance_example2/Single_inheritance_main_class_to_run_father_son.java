package Ex_019_OOPs_Inheritance.single_inheritance_example2;

public class Single_inheritance_main_class_to_run_father_son
{
    public static void main(String[] args) {
        //creating object for father class
        Father f1 = new Father();
        f1.father_gold = 1500;
        f1.home();

        System.out.println(f1.father_gold);

        //creating son class object

        Son s1 = new Son();
        s1.father_gold = 1600;
        System.out.println(s1.father_gold);
        s1.home();
        s1.son_home();
        System.out.println(s1.silver);
        s1.silver = 100;
        System.out.println(s1.silver);
    }
}
