package com.rongyi.easy.malllife.common.util;

import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.crypto.bcrypt.BCrypt;

public class PwdUtil {
	public static final String SALT = "Grass";
	public static void main(String[] args) throws Exception {
		
		System.out.println(">>>"+BCrypt.checkpw("19860227", "$2a$10$PeevnmQ8uTfiYNbDhw8DSeDsR9qKywyg0vsa7eG2EvRrKpMrNV3bq"));
		String hashed2 = BCrypt.hashpw("111111", BCrypt.gensalt());
		System.out.println(hashed2); // 产生因子2，默认10
		hashed2 = BCrypt.hashpw("111111", BCrypt.gensalt(12));
		System.out.println(hashed2); // Check that an unencrypted password
									// matches one that has // previously been
									// hashed
		if (BCrypt.checkpw("111111", hashed2))
			System.out.println("It matches");
		else
			System.out.println("It does not match");

		Md5PasswordEncoder encoder = new Md5PasswordEncoder();
		
		String password = "123456789";
		password = MD5Encryption.encrypt(password);
//		password = encoder.encodePassword(password, PwdUtil.SALT);
		System.out.println(password);
		
		
		// Hash a password for the first time
//		String hashed = BCrypt.hashpw(password, BCrypt.gensalt());

		// gensalt's log_rounds parameter determines the complexity
		// the work factor is 2**log_rounds, and the default is 10
		String hashed = BCrypt.hashpw(password, BCrypt.gensalt(12));
		String pwd = "$2a$10$HRgu7Uu//iL5iKG3aRJ2x.Lgem354PA7/MsgX93R4fpcRC8iIvrBm";
		//$2a$10$36aWRv9D8bMOveHnI9q97u:$2a$10$36aWRv9D8bMOveHnI9q97u1mXK4PBQEKoChQuVVMMT6bo/Z0al38O
		String salt = "$2a$10$HRgu7Uu//iL5iKG3aRJ2x.";
		for(int i=0; i<3; i++) {
//			salt = BCrypt.gensalt(12);
			hashed = BCrypt.hashpw(password, salt);
			System.out.println(salt+":"+hashed);
			if(hashed.indexOf(pwd) != -1) {
				System.out.println(salt);
			}
		}
		// Check that an unencrypted password matches one that has
		// previously been hashed
//		if (BCrypt.checkpw(candidate, hashed))
//			System.out.println("It matches");
//		else
//			System.out.println("It does not match");
	}
}
