package com.example.projectgroup1.repository;

import com.example.projectgroup1.entity.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

;

@SpringBootTest
public class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private TourRepository tourRepository;

    @Autowired
    private BookingRepository bookingRepository;

    @Autowired
    private ReviewRepository reviewRepository;

    @Autowired
    private TourGuideRepository tourGuideRepository;

    @Autowired
    private TourImagesRepository tourImagesRepository;

    @Autowired
    private TourLocationsRepository tourLocationsRepository;

    @Test
    void saveAll() {
        // Create and save a user
        User user1 = new User("Jonas Schmedtmann", "admin@natours.io", "user-1.jpg", "$2a$12$Q0grHjH9PXc6SxivC8m12.2mZJ9BbKcgFpwSG4Y1ZEII8HJVzWeyS", User.UserRole.admin);
        User user2 = new User("Lourdes Browning", "loulou@example.com", "user-2.jpg", "$2a$12$hP1h2pnNp7wgyZNRwPsOTeZuNzWBv7vHmsR3DT/OaPSUBQT.y0S..", User.UserRole.user);
        User user3 = new User("Sophie Louise Hart", "sophie@example.com", "user-3.jpg", "$2a$12$9nFqToiTmjgfFVJiQvjmreLt4k8X4gGYCETGapSZOb2hHa55t0dDq", User.UserRole.user);
        User user4 = new User("Leo Gillespie", "leo@example.com", "user-5.jpg", "$2a$12$OOPr90tBEBF1Iho3ox0Jde0O/WXUR0VLA5xdh6tWcu7qb.qOCvSg2", User.UserRole.guide);
        User user5 = new User("Ayla Cornell", "ayls@example.com", "user-4.jpg", "$2a$12$tm33.M/4pfEbZF64WbFuHuVFv85v4qEhi.ik8njbud7yaoqCZpjiy", User.UserRole.user);
        User user6 = new User("Leo Gillespie", "leo@example.com", "user-5.jpg", "$2a$12$OOPr90tBEBF1Iho3ox0Jde0O/WXUR0VLA5xdh6tWcu7qb.qOCvSg2", User.UserRole.guide);
        User user7 = new User("Jennifer Hardy", "jennifer@example.com", "user-6.jpg", "$2a$12$XCXvvlhRBJ8CydKH09v1v.jpg0hB9gVVfMVEoz4MsxqL9zb5PrF42", User.UserRole.guide);
        User user8 = new User("Kate Morrison", "kate@example.com", "user-7.jpg", "$2a$12$II1F3aBSFDF3Xz7iB4rk/.a2dogwkClMN5gGCWrRlILrG1xtJG7q6", User.UserRole.guide);
        User user9 = new User("Eliana Stout", "eliana@example.com", "user-8.jpg", "$2a$12$Jb/ILhdDV.ZpnPMu19xfe.NRh5ntE2LzNMNcsty05QWwRbmFFVMKO", User.UserRole.user);
        User user10 = new User("Cristian Vega", "chris@example.com", "user-9.jpg", "$2a$12$r7/jtdWtzNfrfC7zw3uS.eDJ3Bs.8qrO31ZdbMljL.lUY0TAsaAL6", User.UserRole.user);
        User user11 = new User("Steve T. Scaife", "steve@example.com", "user-10.jpg", "$2a$12$q7v9dm.S4DvqhAeBc4KwduedEDEkDe2GGFGzteW6xnHt120oRpkqm", User.UserRole.lead_guide);
        User user12 = new User("Aarav Lynn", "aarav@example.com", "user-11.jpg", "$2a$12$lKWhzujFvQwG4m/X3mnTneOB3ib9IYETsOqQ8aN5QEWDjX6X2wJJm", User.UserRole.lead_guide);
        User user13 = new User("Miyah Myles", "miyah@example.com", "user-12.jpg", "$2a$12$.XIvvmznHQSa9UOI639yhe4vzHKCYO1vpTUZc4d45oiT4GOZQe1kS", User.UserRole.lead_guide);
        User user14 = new User("Ben Hadley", "ben@example.com", "user-13.jpg", "$2a$12$D3fyuS9ETdBBw5lOwceTMuZcDTyVq28ieeGUAanIuLMcSDz6bpfIe", User.UserRole.guide);
        User user15 = new User("Laura Wilson", "laura@example.com", "user-14.jpg", "$2a$12$VPYaAAOsI44uhq11WbZ5R.cHT4.fGdlI9gKJd95jmYw3.sAsmbvBq", User.UserRole.user);
        User user16 = new User("Max Smith", "max@example.com", "user-15.jpg", "$2a$12$l5qamwqcqC2NlgN6o5A5..9Fxzr6X.bjx/8j3a9jYUHWGOL99oXlm", User.UserRole.user);
        User user17 = new User("Isabel Kirkland", "isabel@example.com", "user-16.jpg", "$2a$12$IUnwPH0MGFeMuz7g4gtfvOll.9wgLyxG.9C3TKlttfLtCQWEE6GIu", User.UserRole.user);
        User user18 = new User("Alexander Jones", "alex@example.com", "user-17.jpg", "$2a$12$NnclhoYFNcSApoQ3ML8kk.b4B3gbpOmZJLfqska07miAnXukOgK6y", User.UserRole.user);
        User user19 = new User("Eduardo Hernandez", "edu@example.com", "user-18.jpg", "$2a$12$uB5H1OxLMOqDYTuTlptAoewlovENJvjrLwzsL1wUZ6OkAIByPPBGq", User.UserRole.user);
        User user20 = new User("John Riley", "john@example.com", "user-19.jpg", "$2a$12$11JElTatQlAFo1Obw/dwd..vuVmQyYS7MT14pkl3lRvVPjGA00G8O", User.UserRole.user);
        User user21 = new User("Lisa Brown", "lisa@example.com", "user-20.jpg", "$2a$12$uA9FsDw63v6dkJKGlLQ/8ufYBs8euB7kqIQewyYlZXU5azEKeLEky", User.UserRole.user);

        userRepository.saveAll(List.of(user1,user2,user3,user4,user5, user6, user7, user8, user9, user10, user11, user12, user13, user14, user15, user16, user17, user18, user19, user20, user21));


        // Create and save a tour
        Tour tour1 = new Tour("The Forest Hiker",
                "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.\\nLorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",5,"Breathtaking hike through the Canadian Banff National Park",
                5, 4.7,50 ,397.0,
                "tour-1-cover.jpg",
                "2021-04-25,10:00", "Banff, CAN");
        Tour tour2 = new Tour("The Sea Explorer", "Consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.\\nIrure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum. Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.",
                5,"Exploring the jaw-dropping US east coast by foot and by boat",
                5, 4.7,50 ,397.0,
                "tour-2-cover.jpg",
                "2021-04-25,10:00", "Miami, USA");
        Tour tour3 = new Tour("The Snow Adventurer",
                "Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua, ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum!\nDolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur, exercitation ullamco laboris nisi ut aliquip. Lorem ipsum dolor sit amet, consectetur adipisicing elit!",
                4, "Exciting adventure in the snow with snowboarding and skiing",
                10, 4.5, 6, 997.0,
                "tour-3-cover.jpg",
                "2022-01-05T10:00:00.000Z", "Aspen, USA");
        tourRepository.saveAll(List.of(tour1,tour2));



        // Create and save a review
        Review review = new Review("Great tour experience!", 5.0,user1,tour);
        Review review1 = new Review("Great tour experience!", 5.0,user2,tour);
        reviewRepository.save(review);
        reviewRepository.save(review1);

        // Create and save a tour guide
        TourGuide tourGuide = new TourGuide(user4.getId(), tour.getId());
        TourGuide tourGuide1 = new TourGuide(user4.getId(), tour1.getId());
        TourGuide tourGuide3_1 = new TourGuide("5c8a21d02f8fb814b56fa189", "5c88fa8cf4afda39709c295a");
        TourGuide tourGuide3_2 = new TourGuide("5c8a23412f8fb814b56fa18c", "5c88fa8cf4afda39709c295a");
        TourGuide tourGuide3_3 = new TourGuide("5c8a1f4e2f8fb814b56fa185", "5c88fa8cf4afda39709c295a");


        tourGuideRepository.save(tourGuide);
        tourGuideRepository.save(tourGuide1);

        // Create and save tour images
        TourImages tourImage1_1 = new TourImages("tour-1-1.jpg", tour1);
        TourImages tourImage1_2 = new TourImages("tour-1-2.jpg", tour1);
        TourImages tourImage1_3 = new TourImages("tour-1-3.jpg", tour1);
        TourImages tourImage3_1 = new TourImages("tour-3-1.jpg", tour3);
        TourImages tourImage3_2 = new TourImages("tour-3-2.jpg", tour3);
        TourImages tourImage3_3 = new TourImages("tour-3-3.jpg", tour3);
        List<TourImages> tourImagesList = Arrays.asList(
                new TourImages("tour-2-1.jpg", tour2),
                new TourImages("tour-2-2.jpg", tour2),
                new TourImages("tour-2-3.jpg", tour2)
        );
        tourImagesRepository.saveAll(List.of(tourImage1, tourImage2,tourImage3));
        tourImagesRepository.saveAll(tourImagesList);

        // Create and save tour locations
        TourLocations tourLocation2_1 = new TourLocations("Point", -80.128473,25.781842, "Lummus Park Beach",  1, tour2);
        TourLocations tourLocation2_2 = new TourLocations("Point", -80.647885,24.909047, "Islamorada",  2, tour2);
        TourLocations tourLocation2_3 = new TourLocations("Point",  -81.0784,24.707496, "Sombrero Beach",  3, tour2);
        TourLocations tourLocation2_4 = new TourLocations("Point",  -81.768719,24.552242, "West Key",  5, tour2);
        TourLocations tourLocation3_1 = new TourLocations("Point", -106.855385, 39.182677, "Aspen Highlands", 1, tour3);
        TourLocations tourLocation3_2 = new TourLocations("Point", -106.516623, 39.60499, "Beaver Creek", 2, tour3);

        List<TourLocations> tourLocations = Arrays.asList(
                new TourLocations("Point", -116.214531,51.417611, "Banff National Park",  1, tour1),
                new TourLocations("Point", -118.076152,52.875223, "Jasper National Park",  3, tour1),
                new TourLocations("Point", -117.490309,51.261937, "Glacier National Park of Canada",5, tour1)
        );
        tourLocationsRepository.saveAll(List.of(tourLocation1, tourLocation2, tourLocation3,tourLocation4));
        tourLocationsRepository.saveAll(tourLocations);


        // Create and save a booking
        Booking booking = new Booking(120.00, user1, tour);
        Booking booking1 = new Booking(120.00, user2, tour1);
        bookingRepository.save(booking);
        bookingRepository.save(booking1);
    }


}
