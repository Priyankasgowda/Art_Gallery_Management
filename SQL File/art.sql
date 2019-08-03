-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 30, 2017 at 01:51 PM
-- Server version: 10.1.28-MariaDB
-- PHP Version: 7.1.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `art_gallery`
--

DELIMITER $$
--
-- Procedures
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `review_rating` ()  NO SQL
BEGIN
DECLARE avg float;
DECLARE pid int;
DECLARE DONE INT DEFAULT FALSE;
declare c cursor for 
  SELECT avg(r.rating) as avg, r.p_id as pid FROM reviw r;
  DECLARE CONTINUE HANDLER for NOT FOUND SET DONE=TRUE;
  open c;
  MYLOOP:
  LOOP
  fetch c into avg,pid;
  IF DONE THEN
  LEAVE MYLOOP;
  END IF;
  update painting set total_rating=avg where p_id=pid;
END LOOP;
close c;
end$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `artist`
--

CREATE TABLE `artist` (
  `a_id` int(11) NOT NULL,
  `name` varchar(20) DEFAULT NULL,
  `phone_no` int(11) NOT NULL,
  `address` varchar(35) DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `gender` varchar(6) DEFAULT NULL,
  `c1` varchar(50) NOT NULL,
  `c2` varchar(20) NOT NULL,
  `c3` varchar(30) NOT NULL,
  `email` varchar(30) NOT NULL,
  `pwd` varchar(6) DEFAULT NULL,
  `pic` longblob
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `exhibition`
--

CREATE TABLE `exhibition` (
  `e_id` int(11) NOT NULL,
  `start_date` date DEFAULT NULL,
  `end_date` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `gallery`
--

CREATE TABLE `gallery` (
  `a_id` int(11) DEFAULT NULL,
  `e_id` int(11) DEFAULT NULL,
  `g_id` int(11) NOT NULL,
  `g_name` varchar(25) DEFAULT NULL,
  `location` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `news`
--

CREATE TABLE `news` (
  `a_id` int(11) DEFAULT NULL,
  `n_id` int(11) NOT NULL,
  `newses` varchar(50) DEFAULT NULL,
  `created_date` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `painting`
--

CREATE TABLE `painting` (
  `p_id` int(11) NOT NULL,
  `a_id` int(11) DEFAULT NULL,
  `caption` varchar(30) DEFAULT NULL,
  `yrs` year(4) DEFAULT NULL,
  `category` varchar(25) DEFAULT NULL,
  `object` varchar(25) DEFAULT NULL,
  `cost` int(11) DEFAULT NULL,
  `painting_pic` longblob,
  `total_rating` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Triggers `painting`
--
DELIMITER $$
CREATE TRIGGER `price` BEFORE INSERT ON `painting` FOR EACH ROW BEGIN
IF(NEW.cost<1000) THEN
SIGNAL SQLSTATE '02000' SET MESSAGE_TEXT='WARNING: The price should be more than 1000!';
END IF;
END
$$
DELIMITER ;



-- --------------------------------------------------------

--
-- Table structure for table `reviw`
--

CREATE TABLE `reviw` (
  `p_id` int(11) DEFAULT NULL,
  `cmt` varchar(50) DEFAULT NULL,
  `rating` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


-- --------------------------------------------------------

--
-- Table structure for table `sales`
--

CREATE TABLE `sales` (
  `p_id` int(11) NOT NULL,
  `a_id` int(11) DEFAULT NULL,
  `name` varchar(50) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  `card_no` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
--
-- Indexes for dumped tables
--

--
-- Indexes for table `artist`
--
ALTER TABLE `artist`
  ADD PRIMARY KEY (`a_id`,`phone_no`,`email`,`c1`,`c2`,`c3`);

--
-- Indexes for table `exhibition`
--
ALTER TABLE `exhibition`
  ADD PRIMARY KEY (`e_id`);

--
-- Indexes for table `gallery`
--
ALTER TABLE `gallery`
  ADD PRIMARY KEY (`g_id`,`location`),
  ADD KEY `a_id` (`a_id`),
  ADD KEY `e_id` (`e_id`);

--
-- Indexes for table `news`
--
ALTER TABLE `news`
  ADD PRIMARY KEY (`n_id`),
  ADD KEY `a_id` (`a_id`);

--
-- Indexes for table `painting`
--
ALTER TABLE `painting`
  ADD PRIMARY KEY (`p_id`),
  ADD KEY `a_id` (`a_id`);

--
-- Indexes for table `reviw`
--
ALTER TABLE `reviw`
  ADD KEY `p_id` (`p_id`);



--
-- Indexes for table `sales`
--
ALTER TABLE `sales`
  ADD PRIMARY KEY (`p_id`),
  ADD KEY `a_id` (`a_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `artist`
--
ALTER TABLE `artist`
  MODIFY `a_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1;

--
-- AUTO_INCREMENT for table `exhibition`
--
ALTER TABLE `exhibition`
  MODIFY `e_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1;

--
-- AUTO_INCREMENT for table `gallery`
--
ALTER TABLE `gallery`
  MODIFY `g_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1;

--
-- AUTO_INCREMENT for table `news`
--
ALTER TABLE `news`
  MODIFY `n_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1;

--
-- AUTO_INCREMENT for table `painting`
--
ALTER TABLE `painting`
  MODIFY `p_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1;



-- Constraints for dumped tables
--

--
-- Constraints for table `gallery`
--
ALTER TABLE `gallery`
  ADD CONSTRAINT `gallery_ibfk_1` FOREIGN KEY (`a_id`) REFERENCES `artist` (`a_id`) ON DELETE CASCADE,
  ADD CONSTRAINT `gallery_ibfk_2` FOREIGN KEY (`e_id`) REFERENCES `exhibition` (`e_id`) ON DELETE CASCADE;




--
-- Constraints for table `news`
--
ALTER TABLE `news`
  ADD CONSTRAINT `news_ibfk_1` FOREIGN KEY (`a_id`) REFERENCES `artist` (`a_id`) ON DELETE CASCADE;

--
-- Constraints for table `painting`
--
ALTER TABLE `painting`
  ADD CONSTRAINT `painting_ibfk_1` FOREIGN KEY (`a_id`) REFERENCES `artist` (`a_id`) ON DELETE CASCADE;

--
-- Constraints for table `reviw`
--
ALTER TABLE `reviw`
  ADD CONSTRAINT `reviw_ibfk_1` FOREIGN KEY (`p_id`) REFERENCES `painting` (`p_id`) ON DELETE CASCADE;
COMMIT;

--
-- Constraints for table `sales`
--
ALTER TABLE `sales`
  ADD CONSTRAINT `sales_ibfk_1` FOREIGN KEY (`a_id`) REFERENCES `artist` (`a_id`) ON DELETE CASCADE,
  ADD CONSTRAINT `sales_ibfk_2` FOREIGN KEY (`p_id`) REFERENCES `painting` (`p_id`) ON DELETE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
