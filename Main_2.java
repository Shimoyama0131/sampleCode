package practice;

import java.util.Calendar;
import java.util.Date;
import java.time.*;
import java.time.format.*;

public class Main_2 {
	public static void main(String[] args) {
//		// ���X�g2-1
//		Date now = new Date();
//		System.out.println(now);
//		System.out.println(now.getTime());
//		Date past = new Date(1316622225935L);
//		System.out.println(past);
		
//		// ���X�g2-2
//		//instant�̐���
//		Instant i1 = Instant.now();
//		
//		// Instant��long�l�Ƃ̑��ݕϊ�
//		Instant i2 = Instant.ofEpochMilli(31920291332L);
//		long l = i2.toEpochMilli();
//		
//		// ZonedDateTime�̐���
//		ZonedDateTime z1 = ZonedDateTime.now();
//		ZonedDateTime z2 = ZonedDateTime.of(2014, 1, 2, 3, 4, 5, 6, ZoneId.of("Asia/Tokyo"));
//		
//		// Instant��ZonedDateTime�̑��ݕϊ�
//		Instant i3 = z2.toInstant();
//		ZonedDateTime z3 = i3.atZone(ZoneId.of("Europe/London"));
//		
//		// ZonedDateTime�̗��p
//		System.out.println("�����F" + z2.getYear() + z2.getMonth() + z2.getDayOfMonth());
//		System.out.println("�����h���F" + z3.getYear() + z3.getMonth() + z3.getDayOfMonth());
//		if(z2.isEqual(z3)) {
//			System.out.println("�����͓����u�Ԃ��w���Ă��܂��B");
//		}
		
		// ���X�g2-3
		// LocalDateTime�̐������@
		LocalDateTime l1 = LocalDateTime.now();
		LocalDateTime l2 = LocalDateTime.of(2014, 1, 1, 9, 5 , 0, 0);
		
		// LocalDateTime��ZonedDateTime�̑��ݕϊ�
		ZonedDateTime z1 = l2.atZone(ZoneId.of("Europe/London"));
		LocalDateTime l3 = z1.toLocalDateTime();
		
		// ���X�g2-4
		// �����񂩂�LocalDateTime�𐶐�
		DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate d = LocalDate.parse("2011/08/21", f);
		
		// 1000������v�Z����
		d = d.plusDays(1000);
		String str = d.format(f);
		System.out.println("1000�����" + str);
		
		// ���ݓ��t�Ƃ̔�r
		LocalDate now = LocalDate.now();
		if(now.isAfter(d)) {
			System.out.println("now��d���V����");
		}
		
		// ���X�g2-5
		LocalDate d1 = LocalDate.of(2012, 1, 1);
		LocalDate d2 = LocalDate.of(2012, 1, 4);
		
		// 3���Ԃ�\��Period��2�ʂ�̕��@�Ő���
		Period p1 = Period.ofDays(3);
		Period p2 = Period.between(d1, d2);
		
		// d2�̂����3������v�Z
		LocalDate d3 = d2.plus(p2);
		
		
		
	}
}
