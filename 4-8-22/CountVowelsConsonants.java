
 class CountVowelsConsonants {

	public static void main(String[] args)
  {
        String s="abcdheig";

        int countVowels=0;
        int Consonants=0;
        char c;
        System.out.println(s);
        c=s.charAt(0);

        for(int i=0;i<s.length();i++)
        {
            c=s.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
            {
              countVowels++;

            }
            else if (c=='z'||c=='b'||c=='t'||c=='h'||c=='g')
            {
              Consonants++;

            }
        }
        System.out.println("vowels count in string: "+countVowels);
        System.out.println("Consonanats count in string: "+Consonants);
	}

}
