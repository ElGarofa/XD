package actividaddeelcurso;
import unpaz.ar.com.repositorio.*;
import unpaz.ar.com.servicio.*;


public class Actividad {

	public static void main(String[] args) {

	int[] variable1= {
			622, 81, 375, 241, 116, 904, 199, 627, 784, 608, 155, 44, 644, 625, 46, 94, 386, 253, 671, 282, 323, 660, 582, 644, 688, 968, 743, 285, 468, 941, 139, 753, 527, 935, 981, 795, 67, 944, 737, 832, 971, 998, 732, 120, 205, 551, 772, 979, 212, 385, 348, 492, 13, 672, 566, 31, 571, 482, 44, 131, 888, 421, 364, 98, 154, 950, 184, 355, 553, 267, 125, 69, 48, 743, 422, 388, 606, 875, 954, 690, 186, 488, 765, 777, 285, 147, 386, 972, 64, 176, 24, 388, 862, 274, 145, 443, 758, 321, 757, 73, 796, 462, 114, 949, 411, 609, 505, 172, 106, 117, 68, 249, 961, 16, 717, 228, 969, 108, 834, 57, 953, 397, 55, 965, 844, 52, 312, 868, 174, 8, 720, 873, 404, 978, 84, 62, 172, 677, 851, 164, 217, 913, 989, 232, 474, 441, 902, 720, 152, 207, 591, 591, 68, 108, 78, 814, 30, 981, 726, 9, 667, 471, 264, 943, 597, 684, 580, 690, 506, 844, 616, 803, 88, 607, 595, 236, 236, 436, 95, 300, 333, 964, 315, 516, 702, 362, 578, 539, 859, 955, 353, 661, 934, 7, 517, 938, 914, 203, 761, 311};
	
    int[] variable2= {
    		896, 727, 951, 910, 143, 261, 301, 460, 903, 461, 319, 302, 396, 649, 332, 624, 319, 252, 581, 91, 91, 628, 590, 515, 862, 918, 614, 521, 289, 19, 369, 194, 109, 556, 489, 960, 391, 853, 499, 958, 661, 754, 160, 823, 890, 200, 454, 524, 736, 255, 283, 940, 959, 78, 558, 335, 145, 645, 339, 86, 726, 254, 649, 895, 481, 582, 777, 988, 174, 455, 187, 510, 394, 677, 489, 861, 32, 160, 951, 265, 148, 401, 990, 168, 798, 85, 443, 709, 514, 198, 569, 45, 152, 886, 220, 668, 891, 245, 156, 480, 987, 814, 175, 737, 81, 66, 156, 842, 672, 952, 362, 251, 366, 248, 234, 656, 208, 160, 139, 936, 298, 826, 877, 996, 742, 242, 698, 464, 146, 327, 25, 814, 953, 64, 452, 243, 411, 813, 202, 55, 560, 584, 235, 712, 352, 297, 425, 63, 882, 239, 41, 40, 623, 964, 637, 255, 879, 205, 21, 143, 300, 308, 744, 675, 794, 892, 685, 417, 860, 952, 801, 414, 173, 476, 837, 656, 280, 203, 720, 867, 230, 250, 984, 235, 482, 754, 467, 576, 101, 762, 462, 168, 999, 711, 206, 537, 683, 730, 159, 744};
    
    SepararLista numero1 = new SepararLista(variable1); 
    System.out.println(numero1.getParte1());
    System.out.println(numero1.getParte2());
    
    }

	
}