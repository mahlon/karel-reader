/*
 * קובץ: בייפרלייבאג
 * -----------------
 * משתמש "לולאה" לולאה לשים שורה של צפצופים. תוכנית
 * זו פועלת עבור עולם בכל גודל. עם זאת, כי כל העולם
 * דורש מהלכים פחות אחד מאשר putBeepers זה תמיד
 * מתגעגע ביפר.
 */
import סטנפורד.קאראל.*;
public class בייפרלייןבאג extends קארל {
   public void run() {
   	  /* חוזר עד קארל פונה לקיר */
      while(imentברור()) {
      	 /* מקום ביפר על הכיכר הנוכחית */ 
         שיםאתביפר();
      	 /* עבור לכיכר הבאה */
         מהלך_\_לזוז_\_לעבור();
      }
   }
}