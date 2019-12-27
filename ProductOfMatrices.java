package abcd;

public class ProductOfMatrices {

	public static void main(String[] args) {
		int x[][]=new int[3][3];
		int y[][]=new int[3][3];
		int z[][]=new int[3][3];
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
				x[i][j]=i+1;
		
		for(int i=0;i<3;i++)
		{	for(int j=0;j<3;j++)
			System.out.print(x[i][j]+" ");
		System.out.println();
		}
		
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
				y[i][j]=j+1;
		for(int i=0;i<3;i++)
		{	for(int j=0;j<3;j++)
			System.out.print(y[i][j]+" ");
		System.out.println();
		}
		
		
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				for(int k=0;k<3;k++)
				z[i][j] +=(x[i][k]*y[k][j]);
				
			}
		
		}
		
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++)
				System.out.print(z[i][j]+" ");
			System.out.println();
		}
		

	}

}
