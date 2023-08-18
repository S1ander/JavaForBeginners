package com.fisagrp.course.section7.exercises;

public class Exercise6 {
	public boolean isRightAngled(int side1, int side2, int side3) {

		if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
			return false;
		}
		if (side1 * side1 == (side2 * side2) + (side3 * side3)) {
			return true;
		}
		if (side2 * side2 == (side1 * side1) + (side3 * side3)) {
			return true;
		}
		if (side3 * side3 == (side1 * side1) + (side2 * side2)) {
			return true;
		}
		return false;

		// Al crear variables con los lados del triangulo tendremos un consumo de
		// memoria en ellos por lo que al no validar primero estamos guardando
		// los lados sin verlos antes;

		// int hipoSide1 =(side2*side2)+(side3*side3);
		// int compHipo1 = (side1*side1);

		// int hipoSide2 =(side1*side1)+(side3*side3);
		// int compHipo2 = (side2*side2);

		// int hipoSide3 =(side2*side2)+(side1*side1);
		// int compHipo3 = (side3*side3);

		// if (side1 <=0 || side2<=0 || side3<=0){
		// return false;
		// }
		// if(hipoSide1==compHipo1){
		// return true;
		// }
		// if(hipoSide2==compHipo2){
		// return true;
		// }
		// if(hipoSide3==compHipo3){
		// return true;
		// }
		// return false;

		// Para el retorno de variables tipo boolean necesitamos que solo sea una sola
		// variable de retorno no varias
		// boolean hiposide1 = side1==(side2*side2)+(side3*side3);
		// return hiposide1;

		// boolean hiposide2 = side2 ==(side1*side1)+(side3*side3);
		// return hiposide2;

		// boolean hiposide3 = side3 ==(side1*side1)+(side2*side2);
		// return hiposide3;

	}

}