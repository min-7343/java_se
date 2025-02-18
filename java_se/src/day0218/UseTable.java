package day0218;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

@SuppressWarnings("serial")
public class UseTable extends JFrame {
	public UseTable() {
		super("JTble을 사용");

		String[] columNames= {"번호","이름","주소","비고"};
		String[][] rowData= {{"1","루피","서울시 강남구 역삼동","고무고무"},
				{"2","탄지로","서울시 동대문구 동대문동","귀살대"},
				{"3","이치고","경기도 의왕시","사신"}};
		//1. 모델 만들기
		DefaultTableModel dtm=new DefaultTableModel(rowData,columNames);
		//2. 모델과 view를 has a 관계로 생성
		JTable jt=new JTable(dtm);// 스크롤바가 없음 => 컬럼명이 보이지 않는다.
		JScrollPane jsp=new JScrollPane(jt);
		
		//3. 모델에 데이터 추가
		
		String[] data= {"4","젠이츠","경기도 수원시 영통구 망포동포동","귀살대"};
		dtm.addRow(data);
		dtm.addRow(new String[]{"5","무잔","서울시 중구","두목님"});
		
		
		add("Center",jsp); //컬럼명이 반영이 안된다. => 스크롤 바가 있으면 나온다.
		
		
		
		setBounds(100,50,600,400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		
		
		
		
		
	}

	public static void main(String[] args) {
		new UseTable();
	}//main

}//class
