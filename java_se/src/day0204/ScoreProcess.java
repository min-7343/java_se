package day0204;

public class ScoreProcess {

	private String[] nameArr;// 학생명
	private String[] titleArr;// 츨력라벨명
	private int[][] scoreArr;// 학생들의 점수

	public ScoreProcess() {
		nameArr = new String[] { "루피", "샹디", "쵸파", "조로", "나미" };
		titleArr = new String[] { "번호", "이름", "JavaSE", "Oracle", "JDBC", "HTML", "총점", "평균" };
		scoreArr = new int[][] { { 57, 58, 42, 90 }, { 75, 77, 79, 89 }, { 97, 100, 98, 100 }, { 87, 88, 88, 84 },
				{ 95, 91, 99, 93 } };// 이차원 배열의 초기화
	}// ScoreProcess

	public String[] getNameArr() {
		return nameArr;
	}// getNameArr

	public String[] getTitletArr() {
		return titleArr;
	}// getSubjectArr

	public int[][] getScoreArr() {
		return scoreArr;
	}// getScoreArr

	public void printScore() {
		System.out.println("---------------------------------------------------------");
		System.out.println("\t\t\t시험결과");
		System.out.println("---------------------------------------------------------");
		System.out.printf("응시인원[%d]명\n", nameArr.length);
		System.out.println("---------------------------------------------------------");
		// 타이틀 출력
		for (String title : titleArr) {
			System.out.printf("%s\t", title);
		} // end for
		System.out.println("\n=================================================================");
		// 학생의 번호, 이름, 과목을 출력
		int[] totalSum = new int[scoreArr.length]; // 학생별 총합 점수
		double[] studenteAverage = new double[scoreArr.length]; //학생별 평균점수

		for (int i = 0; i < scoreArr.length; i++) {
			System.out.printf("%d\t%s\t", i + 1, nameArr[i]);
			for (int j = 0; j < scoreArr[i].length; j++) {
				System.out.printf("%d\t", scoreArr[i][j]);
				totalSum[i] += scoreArr[i][j];
				studenteAverage[i] = totalSum[i] / (double) (scoreArr[i].length);
			} // end for
			System.out.printf("%d\t%.2f\t", totalSum[i], studenteAverage[i]);
			System.out.println();
		} // end for
		System.out.println("======================================================================");

		System.out.printf("과목 총점 : ");

		int[] totalSubject = new int[scoreArr[0].length];// 과목 총점

		for (int j = 0; j < scoreArr[0].length; j++) {
			for (int i = 0; i < scoreArr.length; i++) {
				totalSubject[j] += scoreArr[i][j];
			} // end for
		} // end for
		for (int i = 0; i < totalSubject.length; i++) {
			System.out.printf("\t%d", totalSubject[i]);
		}
		System.out.println("\n--------------------------------------------------------------------");

		System.out.printf("과목 평균 : ");
		double[] subjectAverage = new double[scoreArr.length];// 과목 평균 배열
		for (int i = 0; i < totalSubject.length; i++) {
			subjectAverage[i] = (double) (totalSubject[i] / (double) scoreArr.length);
			System.out.printf("\t%.2f", subjectAverage[i]);
		}
		System.out.println("\n--------------------------------------------------------------------");

		int maxScore = totalSum[0];//높은 점수 넣을 변수
		for (int i = 0; i < totalSum.length; i++) { //totalSum에서 높은 값을 찾는다.
			if (maxScore < totalSum[i]) {
				maxScore = totalSum[i];
			}
		} // end for
		int maxScoreIndex = 0;
		for (int i = 0; i < totalSum.length; i++) { //totalSum에서 찾은 최고 점수의 index를 찾는다.
			if (totalSum[i] == maxScore) {
				maxScoreIndex = i;
			}
		}
		System.out.printf("1등 학생의 이름[%s] 번호[%d]\n", nameArr[maxScoreIndex], maxScoreIndex + 1);
		System.out.println("--------------------------------------------------------------------");

		System.out.printf("1등 학생의 점수를 오름차순으로 출력 : ");
		int minTemp = scoreArr[maxScoreIndex][0];//임시 저장소
		int[] tempArr = new int[scoreArr[maxScoreIndex].length];//정렬된 점수를 받는 배열
		
		for (int i = 0; i < scoreArr[0].length ; i++) {
			tempArr[i]=scoreArr[maxScoreIndex][i];
			for (int j = i + 1; j < scoreArr[0].length ; j++) {
				if (scoreArr[maxScoreIndex][i] > scoreArr[maxScoreIndex][j]) {
					minTemp = scoreArr[maxScoreIndex][i];
					scoreArr[maxScoreIndex][i] = scoreArr[maxScoreIndex][j];
					scoreArr[maxScoreIndex][j] = minTemp;
				}
				tempArr[i] = scoreArr[maxScoreIndex][i];
			}

		}
		for (int i = 0; i < scoreArr[0].length ; i++) {
			System.out.printf("\t%d", tempArr[i]);
		}
	}// printScore

	public static void main(String[] args) {
		new ScoreProcess().printScore();

	}// main

}// class
