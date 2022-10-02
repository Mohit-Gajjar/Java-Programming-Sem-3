package Part1.Practical5;

public class MakeTriangle {

    int makeTriangle(int index){
       if (index ==0) {
        return 0;
       }
       return index + makeTriangle(index-1);
    }
}
