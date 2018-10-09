
public class allmain {

		public static void main(String[] args) {
			kotak kotakHitam = new kotak();
			
			kotakHitam.setPanjang(20);
			kotakHitam.setLebar(10);
			
			kotakHitam.hitungLuas();
			kotakHitam.hitungKeliling();
		
			System.out.println("Panjang : " + kotakHitam.getPanjang());
			System.out.println("Lebar : " + kotakHitam.getLebar());
			System.out.println("LuasKotak : " + kotakHitam.getLuas());
			System.out.println("KelilingKotak " + kotakHitam.getKeliling());
			System.out.println("___________________________________________");
					
			{
				//Hasil Mahasiswa
				mahasiswa mhs1 = new mahasiswa();
				mhs1.setNama("Muh Afif");
				mhs1.setNim("D0217301");
				mhs1.setAlamat("Pambusuang");
				mhs1.setGolonganDarah("B");
				mhs1.setStatus("Mahasiswa");
				mhs1.setTinggiBadan(170);
				mhs1.setBeratBadan(45);
				
				System.out.println("Nama : " + mhs1.getNama());
				System.out.println("Nim : " + mhs1.getNim());
				System.out.println("Alamat : " + mhs1.getAlamat());
				System.out.println("GolonganDarah : " + mhs1.getGolonganDarah());
				System.out.println("Status : " + mhs1.getStatus());
				System.out.println("TinggiBadan : " + mhs1.getTinggiBadan());
				System.out.println("BeratBadan : " + mhs1.getBaratBadan());
				System.out.println("---------------------------------------------");

				System.out.println("------Object Kelas node------");
				//membuat object darikelas node
				node node = new node();
				
				//method setter node
				node.label = "nasi";
				node.Value =2;
				
				//method getter node
				System.out.println("Nama Label : " + node.getlabel());
				System.out.println("jumlah label : " + node.getValue());
				
				
				//membuat object darikelas stack
				stack stack = new stack();
				System.out.println("------Object Kelas stack------");
				stack.value[0] = "lancelot";
				stack.value[1] = "akai";
				stack.value[2]= "selena";
				stack.value[3]= "Grock";
				stack.value[4]= ("Martis");
				stack.value[5]= ("Martis");
				stack.value[6]= ("Martis");
				stack.value[7]= ("Martis");
				stack.value[8]= ("Martis");
				stack.value[9]= ("Martis");
				stack.value[10]= ("Martis");
				stack.value[11]= ("Martis");
				stack.value[12]= ("Martis");
				stack.value[13]= ("Martis");
				stack.value[14]= ("Martis");
				stack.value[15]= ("Martis");
				stack.value[16]= ("Martis");
				stack.value[17]= ("Martis");
				stack.value[18]= ("Martis");
				stack.value[19]= ("Martis");
				stack.value[18]= ("Martis");
				stack.value[19]= ("Martis");
				stack.value[20]= ("Martis");
				stack.value[21]= ("Martis");
				stack.value[22]= ("Martis");
				stack.value[23]= ("Martis");
				stack.value[24]= ("Martis");
				stack.value[25]= ("Martis");
				stack.value[26]= ("Martis");
				stack.value[27]= ("Martis");
				stack.value[28]= ("Martis");
				stack.value[29]= ("Martis");
				stack.value[30]= ("Martis");
				stack.value[31]= ("Martis");
				stack.value[32]= ("Martis");
				stack.value[33]= ("Martis");
				stack.value[34]= ("Martis");
				stack.value[35]= ("Martis");
				stack.value[36]= ("Martis");
				stack.value[37]= ("Martis");
				stack.value[38]= ("Martis");
				stack.value[39]= ("Martis");
				stack.value[40]= ("Martis");
				stack.value[41]= ("Martis");
				stack.value[42]= ("Martis");
				stack.value[43]= ("Martis");
				stack.value[44]= ("Martis");
				stack.value[45]= ("Martis");
				stack.value[46]= ("Martis");
				stack.value[47]= ("Martis");
				stack.value[48]= ("Martis");
				stack.value[49]= ("Martis");
				stack.value[50]= ("Martis");
				stack.value[51]= ("Martis");
				stack.value[52]= ("Martis");
				stack.value[53]= ("Martis");
				stack.value[54]= ("Martis");
				stack.value[55]= ("Martis");
				stack.value[56]= ("Martis");
				stack.value[57]= ("Martis");
				stack.value[58]= ("Martis");
				stack.value[59]= ("Martis");
				stack.value[60]= ("Martis");
				stack.value[61]= ("Martis");
				stack.value[62]= ("Martis");
				stack.value[63]= ("Martis");
				stack.value[64]= ("Martis");
				stack.value[65]= ("Martis");
				stack.value[66]= ("Martis");
				stack.value[67]= ("Martis");
				stack.value[68]= ("Martis");
				stack.value[69]= ("Martis");
				stack.value[70]= ("Martis");
				stack.value[71]= ("Martis");
				stack.value[72]= ("Martis");
				stack.value[73]= ("Martis");
				stack.value[74]= ("Martis");
				stack.value[75]= ("Martis");
				stack.value[76]= ("Martis");
				stack.value[77]= ("Martis");
				stack.value[78]= ("Martis");
				stack.value[79]= ("Martis");
				stack.value[80]= ("Martis");
				stack.value[81]= ("Martis");
				stack.value[82]= ("Martis");
				stack.value[83]= ("Martis");
				stack.value[84]= ("Martis");
				stack.value[85]= ("Martis");
				stack.value[86]= ("Martis");
				stack.value[87]= ("Martis");
				stack.value[89]= ("Martis");
				stack.value[90]= ("Martis");
				stack.value[91]= ("Martis");
				stack.value[92]= ("Martis");
				stack.value[93]= ("Martis");
				stack.value[94]= ("Martis");
				stack.value[95]= ("Martis");
				stack.value[96]= ("Martis");
				stack.value[97]= ("Martis");
				stack.value[98]= ("Martis");
				stack.value[99]= ("Martis");
				

				for(int i=0;i<stack.value.length;i++){System.out.println(stack.value[i]);};
			}
	}
	}

