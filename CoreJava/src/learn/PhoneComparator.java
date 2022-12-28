package learn;

import java.util.Comparator;

public class PhoneComparator implements Comparator<Emp>{

	@Override
	public int compare(Emp o1, Emp o2) {
		// TODO Auto-generated method stub
		return o1.getPhone().compareTo(o2.getPhone());
	}

}
 