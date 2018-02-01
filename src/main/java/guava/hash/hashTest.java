package guava.hash;

import com.google.common.hash.HashFunction;
import com.google.common.hash.Hashing;
import org.junit.Test;

/**
 * Created by Linuxea on 2017/8/18.
 */
public class hashTest {

	@Test
	public void test() {
		HashFunction hashFunction = Hashing.hmacMd5("linuxea".getBytes());
		System.out.println(hashFunction.bits());

		HashFunction hashFunction1 = Hashing.md5();
		System.out.println(hashFunction1.newHasher().hash());
	}

}
