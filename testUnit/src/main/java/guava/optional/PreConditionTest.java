package guava.optional;

import com.google.common.base.Preconditions;
import org.junit.Test;

/**
 * Created by Linuxea on 2017/8/18.
 */
public class PreConditionTest {

	@Test
	public void test(){
		String str = null;
		Preconditions.checkNotNull(str,"str can't not be null");
	}

	@Test
	public void testState(){
		Boolean ok = Boolean.FALSE;
		Preconditions.checkState(ok == false,"ok should be false");
	}

}
