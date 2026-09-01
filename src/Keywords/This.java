package Keywords;

class Father4{
    int a;
    int b;
    int ans;
    void sum(int a,int b){
        this.a=a;
        this.b=b;
        this.ans = (a+b);

        //// this.a → class variable
        //// a     → method parameter
    }

}

public class This {
    static void main(String[] args) {
        Father4 f = new Father4();
        f.sum(5,1);
        System.out.println(f.ans);
    }
}

// "this" is a Java keyword that refers to the current object.

// f.sum(5,1)
//     ↓
// this.a = 5
// this.b = 1
// this.ans = 6
//     ↓
// f.ans
//     ↓
// 6