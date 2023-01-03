//Jason Buras Problem 1: Datatype Util
public class LogicalUtil{
	public static boolean thereExists(boolean p, boolean q, boolean r){
		//Returns true if at least one condition is true
		return p || q || r;
	}
	public static boolean forAll(boolean p, boolean q, boolean r){
		//Returns true only if all conditions are true
		return p && q && r;
	}

	public static boolean majority(boolean p, boolean q, boolean r){
		//Returns true only if a majority of the conditions are true
		return (p && q) || (q && r) || (p && r);
	}
	public static boolean minority(boolean p, boolean q, boolean r){
		//Returns true only if a majority of conditions are false
		return !(majority(p,q,r));
	}
	public static boolean implies(boolean p, boolean q){
		//Returns true unless p is true and q is false. This is: p implies q
		return !p || q;
	}
	public static boolean implies(boolean p, boolean q, boolean r){
		//Returns true unless both p,q are true and r is false. This is: p implies q implies r
		return !p || implies(q,r);
	}

}