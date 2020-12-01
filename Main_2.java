package practice;

import java.util.Calendar;
import java.util.Date;
import java.time.*;
import java.time.format.*;

public class Main_2 {
	public static void main(String[] args) {
//		// リスト2-1
//		Date now = new Date();
//		System.out.println(now);
//		System.out.println(now.getTime());
//		Date past = new Date(1316622225935L);
//		System.out.println(past);
		
//		// リスト2-2
//		//instantの生成
//		Instant i1 = Instant.now();
//		
//		// Instantとlong値との相互変換
//		Instant i2 = Instant.ofEpochMilli(31920291332L);
//		long l = i2.toEpochMilli();
//		
//		// ZonedDateTimeの生成
//		ZonedDateTime z1 = ZonedDateTime.now();
//		ZonedDateTime z2 = ZonedDateTime.of(2014, 1, 2, 3, 4, 5, 6, ZoneId.of("Asia/Tokyo"));
//		
//		// InstantとZonedDateTimeの相互変換
//		Instant i3 = z2.toInstant();
//		ZonedDateTime z3 = i3.atZone(ZoneId.of("Europe/London"));
//		
//		// ZonedDateTimeの利用
//		System.out.println("東京：" + z2.getYear() + z2.getMonth() + z2.getDayOfMonth());
//		System.out.println("ロンドン：" + z3.getYear() + z3.getMonth() + z3.getDayOfMonth());
//		if(z2.isEqual(z3)) {
//			System.out.println("これらは同じ瞬間を指しています。");
//		}
		
		// リスト2-3
		// LocalDateTimeの生成方法
		LocalDateTime l1 = LocalDateTime.now();
		LocalDateTime l2 = LocalDateTime.of(2014, 1, 1, 9, 5 , 0, 0);
		
		// LocalDateTimeとZonedDateTimeの相互変換
		ZonedDateTime z1 = l2.atZone(ZoneId.of("Europe/London"));
		LocalDateTime l3 = z1.toLocalDateTime();
		
		// リスト2-4
		// 文字列からLocalDateTimeを生成
		DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate d = LocalDate.parse("2011/08/21", f);
		
		// 1000日後を計算する
		d = d.plusDays(1000);
		String str = d.format(f);
		System.out.println("1000日後は" + str);
		
		// 現在日付との比較
		LocalDate now = LocalDate.now();
		if(now.isAfter(d)) {
			System.out.println("nowはdより新しい");
		}
		
		// リスト2-5
		LocalDate d1 = LocalDate.of(2012, 1, 1);
		LocalDate d2 = LocalDate.of(2012, 1, 4);
		
		// 3日間を表すPeriodを2通りの方法で生成
		Period p1 = Period.ofDays(3);
		Period p2 = Period.between(d1, d2);
		
		// d2のさらに3日後を計算
		LocalDate d3 = d2.plus(p2);
		
		
		
	}
}
