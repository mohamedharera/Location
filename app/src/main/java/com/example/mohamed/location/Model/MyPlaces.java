package com.example.mohamed.location.Model;

/**
 * Created by Mohamed on 9/22/2018.
 */

public class MyPlaces {
    // https://maps.googleapis.com/maps/api/place/nearbysearch/json?location=-33.8670522,151.1957362&radius=1500&type=market&sensor=true&key=YOUR_API_KEY
    // this is the link for json data use them to convert json into pojo

    private String next_page_token;

    private Results[] results;

    private String[] html_attributions;

    private String status;

    public String getNext_page_token ()
    {
        return next_page_token;
    }

    public void setNext_page_token (String next_page_token)
    {
        this.next_page_token = next_page_token;
    }

    public Results[] getResults ()
    {
        return results;
    }

    public void setResults (Results[] results)
    {
        this.results = results;
    }

    public String[] getHtml_attributions ()
    {
        return html_attributions;
    }

    public void setHtml_attributions (String[] html_attributions)
    {
        this.html_attributions = html_attributions;
    }

    public String getStatus ()
    {
        return status;
    }

    public void setStatus (String status)
    {
        this.status = status;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [next_page_token = "+next_page_token+", results = "+results+", html_attributions = "+html_attributions+", status = "+status+"]";
    }
}
