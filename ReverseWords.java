class ReverseWords{
    public String reverseWords(String s){
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
            if(!words[i].isEmpty()){
                sb.append(words[i]).append(" ");
            }
        }
        return sb.toString().trim();
    }
    public static void main(String[] args) {
        ReverseWords rw = new ReverseWords();
        System.out.println(rw.reverseWords("Hello I am Nikita ."));
    }
}