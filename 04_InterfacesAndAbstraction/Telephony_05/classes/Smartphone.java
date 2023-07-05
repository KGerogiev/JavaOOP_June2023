package Telephony_05.classes;

import Telephony_05.interfaces.Browsable;
import Telephony_05.interfaces.Callable;

import java.util.List;

public class Smartphone implements Callable, Browsable {

    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls){
        this.numbers = numbers;
        this.urls = urls;
    }

    @Override
    public String browse() {

        StringBuilder sb = new StringBuilder();

        for (String url : this.urls){

            if (isValidUrl(url)){
               sb.append(System.lineSeparator()).append("Browsing: " + url + "!");

            } else {
             sb.append(System.lineSeparator()).append("Invalid URL!");
            }
        }
        return sb.toString();
    }

    @Override
    public String call() {

        StringBuilder sb = new StringBuilder();

        for (String number : this.numbers){

            if (isValidNumber(number)){
                sb.append(System.lineSeparator()).append("Calling... " + number);

            } else {
                sb.append(System.lineSeparator()).append("Invalid number!");
            }
        }
        return sb.toString();
    }

    public boolean isValidUrl(String url){
        boolean isValid = true;
        char [] urlArr = url.toCharArray();
        for (int i = 0; i < urlArr.length; i++) {
            if (Character.isDigit(urlArr[i])){
                isValid = false;
                break;
            }
        }
        return isValid;
    }

    public boolean isValidNumber(String number){
        boolean isValid = true;
        char [] numberArr = number.toCharArray();
        for (int i = 0; i < numberArr.length; i++) {
            if (!Character.isDigit(numberArr[i])){
                isValid = false;
                break;
            }
        }
        return isValid;
    }
}
