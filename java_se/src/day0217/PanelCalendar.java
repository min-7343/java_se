package day0217;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


//여러번 사용할 것 같으면, static으로 받아서 사용하는 것이 좋다.
import static java.util.Calendar.DAY_OF_MONTH;
import static java.util.Calendar.DAY_OF_WEEK;


@SuppressWarnings("serial")
public class PanelCalendar extends JPanel {
   
   public static final int NUMBER_OF_DAYS=7;
   

   public PanelCalendar() {
      
      Font font=new Font("맑은 고딕",Font.BOLD,20);
      Color btnForeground=new Color(0x3C76C2);
      Color btnBackground=new Color(0xC3D2E5);
      
      //마지막날의 행의 수 얻기
      Calendar cal=Calendar.getInstance();//년-월-일(오늘)
      //오늘 얻기
      int nowDay=cal.get(DAY_OF_MONTH);
      
      
      
      //마지막날 얻기
      int lastDay=cal.getActualMaximum(DAY_OF_MONTH);
      System.out.println(lastDay);
      //오늘의 정보를 가진 달력객체에 마지막 날을 설정.
      cal.set(DAY_OF_MONTH, lastDay);
//      System.out.println(cal);
      //마지막 날의 주의 번호
      int lastWeek=cal.get(Calendar.WEEK_OF_MONTH);//주의 번호를 얻을 수 있다., 즉 마지막 날이 있는 주는 5주차=>이게 행의 수가 된다.
//      System.out.println(lastWeek);
      
      
      //패널에 배치할 컴포넌트를 선언
      JButton[][] jbtnDays=new JButton[lastWeek][NUMBER_OF_DAYS];
      
      
      //배치관리 변경
      setLayout(new GridLayout(lastWeek,NUMBER_OF_DAYS));
      
      //배치
      //1일을 설정하고, 요일의 수 얻기
      cal.set(DAY_OF_MONTH, 1);
      int weekNumber=cal.get(Calendar.DAY_OF_WEEK);
//      System.out.println(weekNumber);
      
      
      //1일 전의 공백을 생성
      Color colorBlank=new Color(0xEBF2F6);
      for(int jbtnblank=1; jbtnblank<weekNumber; jbtnblank++) {
         jbtnDays[0][jbtnblank-1]=new JButton("");
         jbtnDays[0][jbtnblank-1].setBackground(colorBlank);
      }//end for
      
      //1일 부터 마지막 날까지 반복
      int rowCnt=0; //설정된 날짜의 주수를 얻으면 행수와 일치 cal.get(Calendar.WEEK_OF_MONTH);
      int columnCnt=0;
      JButton jbtnTemp=null;

      for(int tempDay=1; ; tempDay++) {//조건이 없기 때문에, 무한 루프가 된다.
         //calendar에 1씩 증가하는 임시일자 설정
         cal.set(DAY_OF_MONTH,tempDay);
         
         //tempDay가 2월인 경우 28이 들어가면, 28이 나오는데...
         //29가 들어가면, 다음달 1일 반환
         System.out.println("임시 날짜 "+tempDay+", 설정되어 반환되는 날짜 "+cal.get(DAY_OF_MONTH));
         if(cal.get(DAY_OF_MONTH) != tempDay) {//설정된 일자와 임시 일자가 다르면
            //cal 객체는 다음 달 1일로 설정.
            //빠져나가기 전에 공백을 만든다.

            for(int jbtnBlank=cal.get(Calendar.DAY_OF_WEEK); jbtnBlank<8 ; jbtnBlank++) {
//               jbtnDays[rowCnt][jbtnBlank-1]=new JButton("");
//               jbtnDays[rowCnt][jbtnBlank-1].setBackground(colorBlank);
//               jbtnTemp.setBackground(colorBlank);
               
               jbtnTemp=new JButton("");
               jbtnTemp.setBackground(colorBlank);
               jbtnDays[rowCnt][jbtnBlank-1]=jbtnTemp;
            }//end for
            break;//반복문을 빠져 나간다.
         }//end if
            
            //증가하는 임시번호 일자를 설정, 
            //글자색, 바닥색 설정
            columnCnt=cal.get(Calendar.DAY_OF_WEEK);
            
//            jbtnDays[rowCnt][columnCnt-1]=new JButton(String.valueOf(tempDay));
//            jbtnDays[rowCnt][columnCnt-1].setBackground(btnBackground);
//            jbtnDays[rowCnt][columnCnt-1].setForeground(btnForeground);
            
            jbtnTemp=new JButton(String.valueOf(tempDay));
            jbtnTemp.setBackground(btnBackground);
            jbtnTemp.setForeground(btnForeground);
            
            
            //오늘을 표현
            if(tempDay == nowDay) {
//               jbtnDays[rowCnt][columnCnt-1].setBackground(new Color(0x5B7AAA));
//               jbtnDays[rowCnt][columnCnt-1].addActionListener(new ActionListener(){ 
               jbtnTemp.setBackground(new Color(0x5B7AAA));
               jbtnTemp.addActionListener(new ActionListener(){
                  
                  @Override
                  public void actionPerformed(ActionEvent e) {
                     JOptionPane.showMessageDialog(null, "오늘이다!!!");
                  }//actionPerformed
               });
               
               
            }//end if
            
            jbtnDays[rowCnt][columnCnt-1]=jbtnTemp;
            switch(columnCnt) {
            case Calendar.SATURDAY:
               rowCnt++;
            }//end switch
   
      }//end for
      
      
      //버튼 배열의 생성이 완료 > Panel 배치
      for(JButton[] jbtnArr : jbtnDays) {
         for(JButton jbtn : jbtnArr) {
            add(jbtn);
         }//end for
      }//end for
      
      
      
   }//PanelCalenar
   
}//class