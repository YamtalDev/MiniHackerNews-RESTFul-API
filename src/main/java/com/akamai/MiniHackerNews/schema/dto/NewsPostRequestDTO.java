package com.akamai.MiniHackerNews.schema.dto;

import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

/******************************************************************************
 * @author Tal Aharon
 * @version 1.0.0
 * @license MIT
 * @since 19/9/2023
 * @description : 

******************************************************************************/
public class NewsPostRequestDTO
{
    @NotBlank(message = "User name is required")
    @Size(min = 1, max = 20, message = "User name must be between 3 to 20 characters")
    private String postedBy;

    @NotBlank(message = "Post is required")
    @Size(min = 1, max = 1024, message = "Post must be between 1 and 1024 characters")
    private String post;

    @NotBlank(message = "Url is required.")
    @URL(message = "Invalid URL. Please provide a valid HTTP or HTTPS URL.")
    @Size(min = 10, max = 1024, message = "Link must be between 10 to 1024 characters long")
    private String link;

    public String getPost()
    {
        return (post);
    }

    public String getLink()
    {
        return (link);
    }

    public String getPostedBy()
    {
        return (postedBy);
    }
}
