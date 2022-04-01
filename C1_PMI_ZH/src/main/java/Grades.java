import java.util.ArrayList;
import java.util.List;

public class Grades {

    List<String> grades = new ArrayList<>();

    public void addSubject(String targy) {

        String datas;

        for (int i = 0; i<2; i++ ){
           datas= targy + " -" + " " ;
        }


        grades.add(datas);
    }

    public List<String[]> getGrades(){
        return grades;
    }

    public void dropSubject(String subject) {
        int temp=-1;
        for (String[] elem: grades){
            if (elem.equals(subject)){
                temp = grades.indexOf(elem);
            }
        }
        if (temp != -1){
            grades.remove(temp);
        }
    }
}
