-- phpMyAdmin SQL Dump
-- version 3.2.4
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Feb 20, 2012 at 06:55 PM
-- Server version: 5.1.44
-- PHP Version: 5.3.1

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `cp`
--

-- --------------------------------------------------------

--
-- Table structure for table `agents`
--

CREATE TABLE IF NOT EXISTS `agents` (
  `agentId` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `phone` varchar(12) DEFAULT NULL,
  `fax` varchar(12) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `username` varchar(50) NOT NULL,
  `password` text NOT NULL,
  PRIMARY KEY (`agentId`),
  KEY `agentId` (`agentId`)
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 AUTO_INCREMENT=6 ;

--
-- Dumping data for table `agents`
--

INSERT INTO `agents` (`agentId`, `name`, `phone`, `fax`, `email`, `username`, `password`) VALUES
(1, 'Sue Roberts', '555-1234', '555-9876', 'sue@homesellers.com', 'Sue.Roberts', 'suepass'),
(2, 'Natasha Watkins', '555-1357', '555-9876', 'tasha@homesellers.com', 'Natasha.Watkins', 'natashapass'),
(3, 'Chris Clarkson', '555-2468', '555-6767', 'chris@homesellers.com', 'Chris.Clarkson', 'chrispass'),
(4, 'Laura Blain', '555-9898', '555-6767', 'laura@homesellers.com', 'Laura.Blain', 'laurapass'),
(5, 'Dave Lindale', '555-8833', '555-9876', 'dave@homesellers.com', 'Dave.Lindale', 'davepass');

-- --------------------------------------------------------

--
-- Table structure for table `garagetypes`
--

CREATE TABLE IF NOT EXISTS `garagetypes` (
  `garageId` int(11) NOT NULL AUTO_INCREMENT,
  `gType` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`garageId`),
  KEY `garageId` (`garageId`)
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 AUTO_INCREMENT=4 ;

--
-- Dumping data for table `garagetypes`
--

INSERT INTO `garagetypes` (`garageId`, `gType`) VALUES
(1, 'attached'),
(2, 'detached'),
(3, 'carport');

-- --------------------------------------------------------

--
-- Table structure for table `properties`
--

CREATE TABLE IF NOT EXISTS `properties` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `street` varchar(50) DEFAULT NULL,
  `city` varchar(25) DEFAULT NULL,
  `listingNum` int(11) DEFAULT '0',
  `styleId` int(11) DEFAULT '0',
  `typeId` int(11) DEFAULT '0',
  `bedrooms` int(11) DEFAULT '0',
  `bathrooms` float DEFAULT '0',
  `squarefeet` int(11) DEFAULT '0',
  `description` text,
  `lotsize` varchar(25) DEFAULT NULL,
  `garagesize` tinyint(4) DEFAULT '0',
  `garageId` int(11) DEFAULT '0',
  `agentId` int(11) DEFAULT '0',
  `photo` varchar(50) DEFAULT NULL,
  `price` double DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `id` (`id`),
  KEY `listingNum` (`listingNum`)
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 AUTO_INCREMENT=41 ;

--
-- Dumping data for table `properties`
--

INSERT INTO `properties` (`id`, `street`, `city`, `listingNum`, `styleId`, `typeId`, `bedrooms`, `bathrooms`, `squarefeet`, `description`, `lotsize`, `garagesize`, `garageId`, `agentId`, `photo`, `price`) VALUES
(9, '42 Canalside Dr.', 'Limerick', 443499, 9, 2, 5, 1.5, 1100, 'Water-side condo living! Less than three years old with updated kitchen. Private deck overlooks semi-private yard and a beautiful water view. Includes private dock space for your boat.', '20x45', 1, 1, 3, '443499.jpg', 82000),
(10, '1209 Dockside Trail', 'Dublin', 141136, 1, 1, 5, 2, 1700, 'River-side living awaits you in this updated 1970s-built quality home. Large private yard with huge deck and all the amenities. Call today!', '70x250', 2, 1, 1, '141136.jpg', 203500),
(11, '143 Main St.', 'Cork', 598495, 8, 1, 2, 4, 1800, 'Showpiece historic home. Lovingly restored but with all the modern conveniences. New furnace and central air. Enclosed porch and backyard patio.', '60x120', 2, 2, 4, '598495.jpg', 249900),
(12, '55 Packetsmith Circle', 'Galway', 128365, 3, 1, 2, 1, 1200, 'Great starter home at a fantastic price! Own for less than you pay in rent. Great condition on a quiet street.', '60x90', 1, 1, 4, '128365.jpg', 93900),
(13, '1021 Cambridge Dr.', 'Galway', 941895, 3, 1, 2, 1.5, 1300, 'With some TLC, this could be your dream home. Large back yard overlooks undeveloped wooded land. Wonderful neighborhood and great schools. Grab your tools and make this your new home today!', '60x120', 0, 4, 2, '941895.jpg', 89900),
(14, '123 Horsham Lane', 'Dublin', 387190, 4, 1, 3, 2, 1800, 'This lovingly updated country Victorian sits on a huge lot in the midst of a lovely village. Quiet side street, great schools. This is the home for you.', '70x200', 2, 2, 1, '387190.jpg', 178900),
(15, '481 Monmouth St.', 'Kilkenny', 727218, 1, 1, 5, 2.5, 2100, 'Huge addition and many updates on this lovely old home. Large back deck. Barn for plenty of storage.', '70x140', 2, 2, 5, '727218.jpg', 159900),
(16, '90 Hidden Valley Way', 'Waterford', 727213, 1, 1, 3, 2, 1800, 'Lovely recent home with large yard. New driveway and new paint. Mechanicals in great condition. Ready for you to move in.', '70x110', 1, 2, 4, '727213.jpg', 99900),
(17, '61 Mull Dr.', 'Cork', 197681, 4, 1, 3, 1.5, 1650, 'A brick beauty! Large barn with second-floor loft/office. Quiet side street in a great location. ', '100x110', 2, 1, 1, '197681.jpg', 159500),
(18, '1000', 'Dublin', 523986, 3, 1, 1700, 1, 1000, 'Cozy living in a wonderful location. Only minutes from anywhere. Ready to move in thanks to new utilities. Lovely interior.', '70x100', 1, 2, 1, '523986.jpg', 116900),
(19, '184 Whispering Pines', 'Kilkenny', 778954, 5, 1, 2, 1, 950, 'Charming modern showpiece of a home. You simply must see this architect-designed interior! ', '80x100', 1, 1, 3, '778954.jpg', 106900),
(20, '14 West Ave', 'Limerick', 377190, 8, 1, 4, 2, 2100, 'Grand old home in need of loving owners. Beautiful hardwoods throughout. Two fireplaces. New front portico.', '70x200', 0, 4, 1, '377190.jpg', 179000),
(21, '32 Lincoln St.', 'Derry', 368089, 4, 1, 4, 1.5, 1800, 'Grand victorian home with gumwood trim throughout. Private yard on very quiet side street. Close to everything. Owner anxious to sell.', '70x120', 1, 2, 5, '368089.jpg', 185900),
(22, '134 Islay Dr.', 'Cork', 132927, 1, 1, 5, 1.5, 1750, 'Quality 10-year old home in a great location. Corner lot with plenty of space. Large two-tiered deck and inground pool.', '100x100', 2, 1, 2, '132927.jpg', 132900),
(23, '985 Andover Lane', 'Derry', 493498, 1, 1, 3, 2, 1575, 'All the conveniences...air, new kitchen, whirlpool tub, deck. This is the home for you!', '80x110', 2, 1, 5, '493498.jpg', 139900),
(24, '451 Briggs Ave', 'Dublin', 335965, 5, 1, 3, 1.5, 1900, 'Beautiful home waiting for you! Gorgeous interior is matched by wonderful private gardens outside.', '80x110', 2, 1, 3, '335965.jpg', 145900),
(25, '148 Pineview Park', 'Derry', 854600, 8, 1, 5, 2.5, 2500, 'This huge home awaits your family. Spacious interior. Vaulted ceiling in enormous family room. Wired for audio, video, Internet throughout.', '120x150', 3, 1, 1, '854600.jpg', 145000),
(26, '1398 Marsh Dr.', 'Limerick', 466794, 1, 1, 4, 1.5, 1775, 'Convenience is the name of this home''s game. Close to work and fun. Maintenance free exterior and updated interior. Move-in ready.', '120x150', 2, 1, 3, '466794.jpg', 139500),
(27, '1452 Winding Meadow', 'Derry', 141036, 9, 2, 2, 2, 1400, 'Modern carefree living awaits you in this brand new condo. Low association dues. All maintenance provided. Great for a busy executive like you.', '60x60', 2, 1, 4, '141036.jpg', 159900),
(28, '187 Talltree Circle', 'Limerick', 443498, 1, 1, 3, 1, 1600, 'Lovely home in a great neighborhood. Plenty of space. Private back yard. With your design flair, this could be your showpiece home.', '75x155', 2, 1, 1, '443498.jpg', 135900),
(29, '1582 MacIntyre Lane', 'Cork', 424375, 8, 1, 4, 2, 2100, 'Large home on huge corner lot. Modern-built, but with all the charm of a grand old home. Fantastic low-maintenance landscaping means less work and more enjoyment.', '150x200', 3, 2, 2, '424375.jpg', 162900),
(30, '98 Warwick Drive', 'Belfast', 491686, 1, 1, 1500, 244, 1500, 'Quiet street, great schools, close to work. This is the home for you. 2 year warranty on mechanicals. Lovely gardens\nLovely and a agreat Place to live.', '80x100', 2, 1, 5, '491686.jpg', 119900),
(31, '22 Edinburough St.', 'Limerick', 664622, 3, 1, 2, 1, 975, 'Great starter home for a single or small family. Ready for you to move in today. Updated kitchen and new bath.', '70x100', 1, 1, 1, '664622.jpg', 125900),
(32, '3800', 'Dublin', 281903, 11, 3, 1700, 0, 3800, 'Money-maker! -- 1800s home sensitively converted to an historic office building. Three current tenants will stay. 1800 sq. ft. vacant space awaiting your business. Rents pay all the bills.', '80x120', 0, 4, 5, '281903.jpg', 599900),
(33, '67 Leeds Park Dr.', 'Derry', 490686, 10, 1, 2, 1, 990, 'Apartment living at its best! Private entrance to downstairs aparment. Only three units per building makes for quiet living arrangements. Convenient access to business districts.', '0', 0, 4, 3, '490686.jpg', 350000),
(34, '15234 Whitney Road', 'Kilkenny', 288644, 1, 1, 3, 1, 1300, 'A real charmer! Convenenient home with modern ammenities. New vinyl siding. Needs a loving owner like you.', '120x150', 0, 4, 3, '288644.jpg', 103900),
(35, '20 Deland Park Dr.', 'Limerick', 503986, 8, 1, 4, 1.5, 1900, 'Old home needs new owner. 2 year warranty on mechanicals. Great neighborhood. ', '70x125', 0, 4, 1, '503986.jpg', 109900),
(36, '89 Wincanton Park', 'Dublin', 498495, 1, 1, 3, 1, 1900, 'Large corner lot. New paint job and updated electrical service. This could be your dream home!', '120x130', 2, 2, 1, '498495.jpg', 123900),
(37, '23 Reading Dr.', 'Limerick', 182625, 1, 1, 4, 1.5, 2100, 'Hardwood trim, stone and wood exterior, huge attic could be converted to master suite. Quiet side street in older neighborhood. ', '80x120', 1, 2, 4, '182625.jpg', 149000),
(38, '14 Fifth Ave', 'Dublin', 854605, 8, 1, 4, 1.5, 2000, 'Hardwood trim throughout. This is a real gem. Three-seasons back porch, large yard, finished basement, and third-floor office make this a winner!', '80x120', 1, 2, 2, '854605.jpg', 279900),
(39, '90 W. Lincoln St.', 'Derry', 598795, 8, 1, 3, 1, 1800, 'Just waiting for the right buyer--is that you? Gumwood trim throughout. New kitchen. Large fenced in yard. Finished attic room.', '80x120', 2, 2, 2, '598795.jpg', 129900),
(40, '89 Forest Drove', 'Befast', 784571, 1, 2, 3, 1, 1900, 'Lovely home in a great neighborhood. Plenty of space. Private back yard. With your design flair, this could be your showpiece home.', '80x110', 1, 1, 2, '466794.jpg', 200800);

-- --------------------------------------------------------

--
-- Table structure for table `propertytypes`
--

CREATE TABLE IF NOT EXISTS `propertytypes` (
  `typeId` int(11) NOT NULL AUTO_INCREMENT,
  `pType` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`typeId`),
  KEY `typeId` (`typeId`)
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 AUTO_INCREMENT=4 ;

--
-- Dumping data for table `propertytypes`
--

INSERT INTO `propertytypes` (`typeId`, `pType`) VALUES
(1, 'Residential-single'),
(2, 'Residential-multi'),
(3, 'Commercial');

-- --------------------------------------------------------

--
-- Table structure for table `styles`
--

CREATE TABLE IF NOT EXISTS `styles` (
  `styleId` int(11) NOT NULL AUTO_INCREMENT,
  `pStyle` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`styleId`),
  KEY `styleId` (`styleId`)
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 AUTO_INCREMENT=12 ;

--
-- Dumping data for table `styles`
--

INSERT INTO `styles` (`styleId`, `pStyle`) VALUES
(1, 'Colonial'),
(2, 'Tudor'),
(3, 'Ranch'),
(4, 'Victorian'),
(5, 'Modern'),
(8, 'Traditional'),
(9, 'Condo'),
(10, 'Apartment'),
(11, 'Other');
