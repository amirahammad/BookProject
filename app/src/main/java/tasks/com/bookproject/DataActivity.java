package tasks.com.bookproject;

/**
 * Created by Freeware Sys on 26/03/2018.
 */

public class DataActivity {
    private Integer title , chapterNum ;
    String subject ;


    public  DataActivity(Integer text1,Integer text2,String text3){
        this.title = text1 ;
        this.chapterNum = text2 ;
        this.subject = text3 ;

    }
    public Integer getTitle(){
        return title ;
    }
    public Integer getChapterNum(){
        return chapterNum ;
    }
    public String getSubject(){
        return subject ;
    }
}
