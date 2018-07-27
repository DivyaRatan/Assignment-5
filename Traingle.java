
public class Traingle {
	int side1, side2, side3;

	public int getSide1() {
		return side1;
	}

	public void setSide1(int side1) {
		this.side1 = side1;
	}

	public int getSide2() {
		return side2;
	}

	public void setSide2(int side2) {
		this.side2 = side2;
	}

	public int getSide3() {
		return side3;
	}

	public void setSide3(int side3) {
		this.side3 = side3;
	}

	// Loop for checking that triangle is right angled or not
	public boolean isRight() {
		if (side1 == side2 && side2 == side3 && side3 == side1) {
			return false;
		} else if (side1 * side1 == (side2 * side2 + side3 * side3) || side2 * side2 == (side3 * side3 + side1 * side1)
				|| side3 * side3 == (side2 * side2 + side1 * side1)) {
			return true;
		} else
			return false;
	}

	// Loop for checking that triangle is eqilateral or not
	public boolean isEquilateral() {
		if (side1 == side2 && side2 == side3 && side3 == side1) {
			return true;
		} else
			return false;
	}

	// Loop for checking that triangle is scalane or not
	public boolean isScalane() {
		if (side1 != side2 && side2 != side3 && side3 != side1) {
			return true;
		} else
			return false;
	}

	// Loop for checking that triangle is isoceles or noot
	public boolean isIsoceles() {
		if ((side1 == side2 && side2 != side3) || (side2 == side3 && side3 != side1)
				|| (side3 == side1 && side1 != side2)) {
			return true;
		} else
			return false;
	}

}
