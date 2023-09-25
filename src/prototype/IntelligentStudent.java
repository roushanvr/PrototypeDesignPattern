package prototype;

public class IntelligentStudent extends Student{
 @Override
 public IntelligentStudent clone() {
    IntelligentStudent is =new IntelligentStudent();
    is.setAverageBatchPsp(this.getAverageBatchPsp());
    is.setBatch(this.getBatch());
    return is;
  }
}
