package by.godev.string.work_with_regex.task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
2.  Дана строка, содержащая следующий текст (xml-документ): 
 
<notes> 
   <note id = "1"> 
       <to>Вася</to> 
       <from>Света</from> 
       <heading>Напоминание</heading> 
       <body>Позвони мне завтра!</body> 
   </note> 
   <note id = "2"> 
       <to>Петя</to> 
       <from>Маша</from> 
       <heading>Важное напоминание</heading> 
       <body/> 
   </note> 
</notes> 
 
Напишите анализатор, позволяющий последовательно возвращать содержимое узлов xml-документа и его тип 
(открывающий тег, закрывающий  тег,  содержимое  тега,  тег  без  тела).  
Пользоваться  готовыми  парсерами XML  для  решения  данной  задачи нельзя. 
*/

public class Main {

	public static void main(String[] args) {
		Pattern patternOpenTag;
		Pattern patternCloseTag;
		Pattern patternInternalContent;
		Pattern patternEmpty;
		String xmlDoc;
		String[] arrLines;
		
		xmlDoc = "<notes>\n"
				+ "   <note id = \"1\">\n"
				+ "       <to>Вася</to>\n"
				+ "       <from>Света</from>\n"
				+ "       <heading>Напоминание</heading>\n"
				+ "       <body>Позвони мне завтра!</body>\n"
				+ "   </note>\n"
				+ "   <note id = \"2\">\n"
				+ "       <to>Петя</to>\n"
				+ "       <from>Маша</from>\n"
				+ "       <heading>Важное напоминание</heading>\n"
				+ "       <body/>\n"
				+ "   </note>\n"
				+ "</notes>";

		patternOpenTag = Pattern.compile("<\\w.+?>");
		patternCloseTag = Pattern.compile("</\\w.+?>");
		patternInternalContent = Pattern.compile(">.+?<");
		patternEmpty = Pattern.compile("<\\w.+?/>");
		arrLines = xmlDoc.split("\n");
		
		for (String s : arrLines) {
			Matcher matcherOpenTag;
			Matcher matcherCloseTag;
			Matcher matcherInternalContent;
			Matcher matcherEmpty;
			
			matcherOpenTag = patternOpenTag.matcher(s);
			matcherCloseTag = patternCloseTag.matcher(s);
			matcherInternalContent = patternInternalContent.matcher(s);
			matcherEmpty = patternEmpty.matcher(s);
			
			if (matcherOpenTag.find()) {
				System.out.println("Тег " + matcherOpenTag.group() + " (открытый тег)");
			}
			
			if (matcherInternalContent.find()) {
				System.out.println(matcherInternalContent.group().substring(1, matcherInternalContent.group().length() - 1) + " (внутреннее содержимое)");
			}
			
			if (matcherCloseTag.find()) {
				System.out.println("Тег " + matcherCloseTag.group() + " (закрытый тег)");
			}
			
			if (matcherEmpty.find()) {
				System.out.println("Тег " + matcherEmpty.group() + " (самозакрывающийся тег)");
			}
 		}
	}

}
