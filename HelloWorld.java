/*
* プログラム名:HelloWorld
* 機能:挨拶
* 作成者:浦島
* 作成日:2015/10/09
* バージョン:1.0
* 修正履歴:
*/

public class HelloWorld {
	public static void main(String[] args) {
		//挨拶を出力します
		/*
		System.out.println("HelloWorld!!!!");
		System.out.println("こんにちわ、浦島です");	
		*/
		
		/*
		int age;	//年齢を入れる変数
		
		age=50;		//ageに20を代入する
		
		//結果を出力する
		System.out.println("私は" + age + "歳です。");
		
		System.out.println("$" + 20 + 30);
		System.out.println(20 + 30 + "$");
		*/
		
		int year = 2015;
		int month = 10;
		int day = 9;
		
		System.out.print(year + "/" + month + "/" + day );
		
		System.out.println("");		//改行用
		
		System.out.println(year + "年" + month + "月" + day + "日");
		
		System.out.printf("今日は%d年%d月%d日です",year,month,day);
		
		
	}
}