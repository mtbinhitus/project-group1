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
        // Create and save a tour
        Tour tour1 = new Tour("The Sea Explorer", "Consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.\\nIrure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum. Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.",
                5,"Exploring the jaw-dropping US east coast by foot and by boat",
                5, 4.7,50 ,397.0,
                "tour-2-cover.jpg",
                "2021-04-25,10:00", "Miami, USA");
        Tour tour2 = new Tour("The Forest Hiker",
                "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.\\nLorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",5,"Breathtaking hike through the Canadian Banff National Park",
                5, 4.7,50 ,397.0,
                "tour-1-cover.jpg",
                "2021-04-25,10:00", "Banff, CAN");
        Tour tour3 = new Tour("The Snow Adventurer",
                "Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua, ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum!\nDolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur, exercitation ullamco laboris nisi ut aliquip. Lorem ipsum dolor sit amet, consectetur adipisicing elit!",
                4, "Exciting adventure in the snow with snowboarding and skiing",
                10, 4.5, 6, 997.0,
                "tour-3-cover.jpg",
                "2022-01-05T10:00:00.000Z", "Aspen, USA");
        Tour tour5 = new Tour("The City Wanderer",
                "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat lorem ipsum dolor sit amet.\nConsectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur, nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat!",
                9, "Living the life of Wanderlust in the US' most beautiful cities",
                20, 4.6, 5, 1197.0,
                "tour-4-cover.jpg",
                "2021-03-11T10:00:00.000Z", "NYC, USA");
        Tour tour4 = new Tour("The Park Camper",
                "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.\nDuis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum!",
                10, "Breathing in Nature in America's most spectacular National Parks",
                15, 4.7, 7, 1497.0,
                "tour-5-cover.jpg",
                "2021-08-05T09:00:00.000Z", "Las Vegas, USA");
        Tour tour6 = new Tour("The Sports Lover",
                "Nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.\nVoluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum. Quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur!",
                14, "Surfing, skating, parajumping, rock climbing and more, all in one tour",
                8, 3.9, 7, 2997.0,
                "tour-6-cover.jpg",
                "2021-07-19T09:00:00.000Z", "California, USA");
        Tour tour7 = new Tour("The Star Gazer",
                "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.\nLorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
                9, "The most remote and stunningly beautiful places for seeing the night sky",
                8, 4.8, 6, 2997.0,
                "tour-8-cover.jpg",
                "2021-03-23T10:00:00.000Z", "Utah, USA");
        Tour tour8 = new Tour("The Wine Taster",
                "Consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.\nIrure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum. Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.",
                5, "Exquisite wines, scenic views, exclusive barrel tastings,  and much more",
                8, 4.4, 7, 1997.0,
                "tour-7-cover.jpg",
                "2021-02-12T10:00:00.000Z", "California, USA");
        Tour tour9 = new Tour("The Northern Lights",
                "Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua, ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum!\nDolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur, exercitation ullamco laboris nisi ut aliquip. Lorem ipsum dolor sit amet, consectetur adipisicing elit!",
                3, "Enjoy the Northern Lights in one of the best places in the world",
                12, 4.7, 7, 1497.0,
                "tour-9-cover.jpg",
                "2021-12-16T10:00:00.000Z", "Yellowknife, CAN");

        tourRepository.saveAll(List.of(
                tour1, tour2, tour3, tour4, tour5, tour6, tour7, tour8, tour9
        ));
        // Create and save a user
        User user1 = new User("Jonas Schmedtmann", "admin@natours.io", "user-1.jpg", "$2a$12$Q0grHjH9PXc6SxivC8m12.2mZJ9BbKcgFpwSG4Y1ZEII8HJVzWeyS", User.UserRole.user);
        User user2 = new User("Lourdes Browning", "loulou@example.com", "user-2.jpg", "$2a$12$hP1h2pnNp7wgyZNRwPsOTeZuNzWBv7vHmsR3DT/OaPSUBQT.y0S..", User.UserRole.user);
        User user3 = new User("Sophie Louise Hart", "sophie@example.com", "user-3.jpg", "$2a$12$9nFqToiTmjgfFVJiQvjmreLt4k8X4gGYCETGapSZOb2hHa55t0dDq", User.UserRole.user);
        User user4 = new User("Leo Gillespie", "leo@example.com", "user-5.jpg", "$2a$12$OOPr90tBEBF1Iho3ox0Jde0O/WXUR0VLA5xdh6tWcu7qb.qOCvSg2", User.UserRole.guide);
        User user5 = new User("Ayla Cornell", "ayls@example.com", "user-4.jpg", "$2a$12$tm33.M/4pfEbZF64WbFuHuVFv85v4qEhi.ik8njbud7yaoqCZpjiy", User.UserRole.user);
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

        userRepository.saveAll(List.of(user1,user2,user3,user4,user5, user7, user8, user9, user10, user11, user12, user13, user14, user15, user16, user17, user18, user19, user20, user21));

        // Create and save a review
        Review review1 = new Review("Cras mollis nisi parturient mi nec aliquet suspendisse sagittis eros...", 5.0, user1, tour1);
        Review review2 = new Review("Tempus curabitur faucibus auctor bibendum duis gravida tincidunt...", 4.0, user1, tour2);
        Review review3 = new Review("Convallis turpis porttitor sapien ad urna efficitur dui vivamus in...", 5.0, user1, tour3);
        Review review4 = new Review("Habitasse scelerisque class quam primis convallis integer eros...", 4.5, user1, tour4);
        Review review5 = new Review("Cras consequat fames faucibus ac aliquam dolor a euismod porttitor...", 5.0, user2, tour4);
        Review review6 = new Review("Laoreet justo volutpat per etiam donec at augue penatibus eu facilisis...", 5.0, user2, tour5);
        Review review7 = new Review("Senectus lectus eleifend ex lobortis cras nam cursus accumsan tellus...", 5.0, user2, tour6);
        Review review8 = new Review("Pulvinar taciti etiam aenean lacinia natoque interdum fringilla suspendisse...", 4.5, user2, tour1);
        Review review9 = new Review("Pretium vel inceptos fringilla sit dui fusce varius gravida platea...", 5.0, user3, tour2);
        Review review10 = new Review("Ex a bibendum quis volutpat consequat euismod vulputate parturient laoreet...", 4.5, user3, tour3);
        Review review11 = new Review("Auctor euismod interdum augue tristique senectus nascetur cras justo eleifend...", 5.0, user3, tour8);
        Review review12 = new Review("A facilisi justo ornare magnis velit diam dictumst parturient arcu nullam...", 4.5, user3, tour9);
        Review review13 = new Review("Porttitor ullamcorper rutrum semper proin mus felis varius convallis conubia...", 5.0, user3, tour4);
        Review review14 = new Review("Porttitor ullamcorper rutrum semper proin mus felis varius convallis conubia...", 5.0, user4, tour1);
        Review review15 = new Review("Semper blandit felis nostra facilisi sodales pulvinar habitasse diam sapien...", 5.0, user4, tour2);
        Review review16 = new Review("Neque amet vel integer placerat ex pretium elementum vitae quis ullamcorper...", 5.0, user4, tour8);
        Review review17 = new Review("Nam ultrices quis leo viverra tristique curae facilisi luctus sapien eleifend fames orci lacinia pulvinar.", 4.0, user1, tour9);
        Review review18 = new Review("Ullamcorper ac nec id habitant a commodo eget libero cras congue!", 4.0, user1, tour2);
        Review review19 = new Review("Ultrices nam dui ex posuere velit varius himenaeos bibendum fermentum sollicitudin purus", 5.0, user1, tour4);
        Review review20 = new Review("Ultrices nam dui ex posuere velit varius himenaeos bibendum fermentum sollicitudin purus", 5.0, user2, tour4);
        Review review21 = new Review("Vitae vulputate id quam metus orci cras mollis vivamus vehicula sapien et", 4.0, user2, tour3);
        Review review22 = new Review("Sem risus tempor auctor mattis netus montes tincidunt mollis lacinia natoque adipiscing", 5.0, user2, tour1);
        Review review23 = new Review("Feugiat egestas ac pulvinar quis dui ligula tempor ad platea quisque scelerisque!", 5.0, user2, tour5);
        Review review24 = new Review("Quisque egestas faucibus primis ridiculus mi felis tristique curabitur habitasse vehicula", 4.5, user2, tour6);

        reviewRepository.saveAll(Arrays.asList(
                review1, review2, review3, review4, review5, review6, review7, review8, review9, review10,
                review11, review12, review13, review14, review15, review16, review17,review18,review19,review20,review21,review22,review23,review24
        ));

        // Create and save a tour guide
        TourGuide tourGuide1_1 = new TourGuide(user13.getId(), tour1.getId());
        TourGuide tourGuide1_2 = new TourGuide(user7.getId(), tour1.getId());

        TourGuide tourGuide2_1 = new TourGuide(user11.getId(), tour2.getId());
        TourGuide tourGuide2_2 = new TourGuide(user8.getId(), tour2.getId());
        TourGuide tourGuide2_3 = new TourGuide(user5.getId(), tour2.getId());

        TourGuide tourGuide3_1 = new TourGuide(user11.getId(), tour3.getId());
        TourGuide tourGuide3_2 = new TourGuide(user14.getId(), tour3.getId());
        TourGuide tourGuide3_3 = new TourGuide(user7.getId(), tour3.getId());

        TourGuide tourGuide4_1 = new TourGuide(user12.getId(), tour4.getId());
        TourGuide tourGuide4_2 = new TourGuide(user14.getId(), tour4.getId());

        TourGuide tourGuide5_1 = new TourGuide(user13.getId(), tour5.getId());
        TourGuide tourGuide5_2 = new TourGuide(user8.getId(), tour5.getId());

        TourGuide tourGuide6_1 = new TourGuide(user13.getId(), tour6.getId());
        TourGuide tourGuide6_2 = new TourGuide(user5.getId(), tour6.getId());
        TourGuide tourGuide6_3 = new TourGuide(user7.getId(), tour6.getId());

        TourGuide tourGuide7_1 = new TourGuide(user11.getId(), tour7.getId());
        TourGuide tourGuide7_2 = new TourGuide(user5.getId(), tour7.getId());

        TourGuide tourGuide8_1 = new TourGuide(user13.getId(), tour8.getId());
        TourGuide tourGuide8_2 = new TourGuide(user14.getId(), tour8.getId());

        TourGuide tourGuide9_1 = new TourGuide(user12.getId(), tour9.getId());
        TourGuide tourGuide9_2 = new TourGuide(user8.getId(), tour9.getId());
        TourGuide tourGuide9_3 = new TourGuide(user14.getId(), tour9.getId());

        tourGuideRepository.saveAll(List.of(
                tourGuide1_1, tourGuide1_2,
                tourGuide2_1, tourGuide2_2, tourGuide2_3,
                tourGuide3_1, tourGuide3_2, tourGuide3_3,
                tourGuide4_1, tourGuide4_2,
                tourGuide5_1, tourGuide5_2,
                tourGuide6_1, tourGuide6_2, tourGuide6_3,
                tourGuide7_1, tourGuide7_2,
                tourGuide8_1, tourGuide8_2,
                tourGuide9_1, tourGuide9_2, tourGuide9_3
        ));


        // Create and save tour images
        TourImages tourImage1_1 = new TourImages("tour-1-1.jpg", tour1);
        TourImages tourImage1_2 = new TourImages("tour-1-2.jpg", tour1);
        TourImages tourImage1_3 = new TourImages("tour-1-3.jpg", tour1);
        TourImages tourImage3_1 = new TourImages("tour-3-1.jpg", tour3);
        TourImages tourImage3_2 = new TourImages("tour-3-2.jpg", tour3);
        TourImages tourImage3_3 = new TourImages("tour-3-3.jpg", tour3);
        TourImages tourImage4_1 = new TourImages("tour-4-1.jpg", tour4);
        TourImages tourImage4_2 = new TourImages("tour-4-2.jpg", tour4);
        TourImages tourImage4_3 = new TourImages("tour-4-3.jpg", tour4);
        TourImages tourImage5_1 = new TourImages("tour-5-1.jpg", tour5);
        TourImages tourImage5_2 = new TourImages("tour-5-2.jpg", tour5);
        TourImages tourImage5_3 = new TourImages("tour-5-3.jpg", tour5);
        TourImages tourImage6_1 = new TourImages("tour-6-1.jpg", tour6);
        TourImages tourImage6_2 = new TourImages("tour-6-2.jpg", tour6);
        TourImages tourImage6_3 = new TourImages("tour-6-3.jpg", tour6);
        TourImages tourImage7_1 = new TourImages("tour-7-1.jpg", tour7);
        TourImages tourImage7_2 = new TourImages("tour-7-2.jpg", tour7);
        TourImages tourImage7_3 = new TourImages("tour-7-3.jpg", tour7);
        TourImages tourImage8_1 = new TourImages("tour-8-1.jpg", tour8);
        TourImages tourImage8_2 = new TourImages("tour-8-2.jpg", tour8);
        TourImages tourImage8_3 = new TourImages("tour-8-3.jpg", tour8);
        TourImages tourImage9_1 = new TourImages("tour-9-1.jpg", tour9);
        TourImages tourImage9_2 = new TourImages("tour-9-2.jpg", tour9);
        TourImages tourImage9_3 = new TourImages("tour-9-3.jpg", tour9);

        List<TourImages> tourImagesList = Arrays.asList(
                new TourImages("tour-2-1.jpg", tour2),
                new TourImages("tour-2-2.jpg", tour2),
                new TourImages("tour-2-3.jpg", tour2)
        );
        tourImagesRepository.saveAll(tourImagesList);
        tourImagesRepository.saveAll(List.of(
                tourImage1_1, tourImage1_2, tourImage1_3,
                tourImage3_1, tourImage3_2, tourImage3_3,
                tourImage4_1, tourImage4_2, tourImage4_3,
                tourImage5_1, tourImage5_2, tourImage5_3,
                tourImage6_1, tourImage6_2, tourImage6_3,
                tourImage7_1, tourImage7_2, tourImage7_3,
                tourImage8_1, tourImage8_2, tourImage8_3,
                tourImage9_1, tourImage9_2, tourImage9_3
        ));


        // Create and save tour locations
        TourLocations tourLocation2_1 = new TourLocations("Point", -80.128473,25.781842, "Lummus Park Beach",  1, tour1);
        TourLocations tourLocation2_2 = new TourLocations("Point", -80.647885,24.909047, "Islamorada",  2, tour1);
        TourLocations tourLocation2_3 = new TourLocations("Point",  -81.0784,24.707496, "Sombrero Beach",  3, tour1);
        TourLocations tourLocation2_4 = new TourLocations("Point",  -81.768719,24.552242, "West Key",  5, tour1);
        TourLocations tourLocation3_1 = new TourLocations("Point", -106.855385, 39.182677, "Aspen Highlands", 1, tour3);
        TourLocations tourLocation3_2 = new TourLocations("Point", -106.516623, 39.60499, "Beaver Creek", 2, tour3);
        TourLocations tourLocation4_1 = new TourLocations("Point", -73.967696, 40.781821, "New York", 1, tour4);
        TourLocations tourLocation4_2 = new TourLocations("Point", -118.324396, 34.097984, "Los Angeles", 3, tour4);
        TourLocations tourLocation4_3 = new TourLocations("Point", -122.408865, 37.787825, "San Francisco", 5, tour4);
        TourLocations tourLocation5_1 = new TourLocations("Point", -112.987418, 37.198125, "Zion Canyon National Park", 1, tour5);
        TourLocations tourLocation5_2 = new TourLocations("Point", -111.376161, 36.86438, "Antelope Canyon", 4, tour5);
        TourLocations tourLocation5_3 = new TourLocations("Point", -112.115763, 36.058973, "Grand Canyon National Park", 5, tour5);
        TourLocations tourLocation5_4 = new TourLocations("Point", -116.107963, 34.011646, "Joshua Tree National Park", 9, tour5);
        TourLocations tourLocation6_1 = new TourLocations("Point", -118.809361, 34.003098, "Point Dume Beach", 1, tour6);
        TourLocations tourLocation6_2 = new TourLocations("Point", -118.47549, 33.987367, "Venice Skate Park", 4, tour6);
        TourLocations tourLocation6_3 = new TourLocations("Point", -116.830104, 33.022843, "San Diego Skydive", 6, tour6);
        TourLocations tourLocation6_4 = new TourLocations("Point", -118.4547, 35.710359, "Kern River Rafting", 7, tour6);
        TourLocations tourLocation6_5 = new TourLocations("Point", -119.600492, 37.742371, "Yosemite National Park", 10, tour6);
        TourLocations tourLocation7_1 = new TourLocations("Point", -122.479887, 38.510312, "Beringer Vineyards", 1, tour7);
        TourLocations tourLocation7_2 = new TourLocations("Point", -122.582948, 38.585707, "Clos Pegase Winery & Tasting Room", 3, tour7);
        TourLocations tourLocation7_3 = new TourLocations("Point", -122.434697, 38.482181, "Raymond Vineyard and Cellar", 5, tour7);
        TourLocations tourLocation8_1 = new TourLocations("Point", -109.99953, 37.629017, "Natural Bridges National Monument", 1, tour8);
        TourLocations tourLocation8_2 = new TourLocations("Point", -111.50954, 36.883269, "Horseshoe Bend", 3, tour8);
        TourLocations tourLocation8_3 = new TourLocations("Point", -117.07399, 36.501435, "Death Valley National Park", 6, tour8);
        TourLocations tourLocation9_1 = new TourLocations("Point", -114.406097, 62.439943, "Yellowknife", 1, tour9);


        List<TourLocations> tourLocations = Arrays.asList(
                new TourLocations("Point", -116.214531,51.417611, "Banff National Park",  1, tour2),
                new TourLocations("Point", -118.076152,52.875223, "Jasper National Park",  3, tour2),
                new TourLocations("Point", -117.490309,51.261937, "Glacier National Park of Canada",5, tour2)
        );

        tourLocationsRepository.saveAll(Arrays.asList(
                tourLocation2_1, tourLocation2_2, tourLocation2_3, tourLocation2_4,
                tourLocation3_1, tourLocation3_2,
                tourLocation4_1, tourLocation4_2, tourLocation4_3,
                tourLocation5_1, tourLocation5_2, tourLocation5_3, tourLocation5_4,
                tourLocation6_1, tourLocation6_2, tourLocation6_3, tourLocation6_4, tourLocation6_5,
                tourLocation7_1, tourLocation7_2, tourLocation7_3,
                tourLocation8_1, tourLocation8_2, tourLocation8_3,
                tourLocation9_1
        ));
        tourLocationsRepository.saveAll(tourLocations);


        // Create and save a booking
        Booking booking = new Booking(120.00, user1, tour1);
        Booking booking1 = new Booking(120.00, user2, tour1);
        bookingRepository.save(booking);
        bookingRepository.save(booking1);
    }


}
