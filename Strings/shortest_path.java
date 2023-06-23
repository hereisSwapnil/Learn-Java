public class shortest_path {
    public static void main(String args[]){
        int i = 0;
        int j = 0;
        String path = "WNEENESENNN";
        for(int k = 0; k<path.length(); k++){
            if(path.charAt(k) == 'N'){
                j++;
            }else if(path.charAt(k) == 'S'){
                j--;
            }else if(path.charAt(k) == 'E'){
                i++;
            }else if(path.charAt(k) == 'W'){
                i--;
            }
        }
        double shortest_path = Math.sqrt((Math.pow(i, 2))+(Math.pow(j, 2)));
        System.out.println("The shortest Path is: "+shortest_path);
    }
}
