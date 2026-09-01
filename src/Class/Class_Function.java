package Class;

class applicationform{
    String name;
    int age;

    public void display(){
        System.out.println(name);
        System.out.println(age);
    }
    public void setValues(String str,int inAge){ //setup function
        name = str;
        age = inAge;
    }
}
class Main1{
    public static void main(String[] args){
        applicationform ab = new applicationform();
        ab.setValues("Balaji",34);
        ab.display();

    }
}

//applicationform
//       │
//       ├── display()
//       │      ↓
//       │   Non-parameterized
//       │
//       └── setValues(String str, int inAge)
//              ↓
//           Parameterized