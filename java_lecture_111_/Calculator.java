package java_lecture_111_;

class Calculator implements Interface_cal {
    int first, second, third;
    public void setOprands(int first, int second, int third){
        this.first = first;
        this.second = second;
        this.third = third;
    }
    public int sum(){
        return this.first + this.second + this.third;
    }
    public int avg(){
        return sum()/3;
    }
}
