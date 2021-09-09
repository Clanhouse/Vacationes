import React from 'react';
import './index.scss';
import logo from '../../assets/images/Navbar images/Group 289.png';
import rectangle from '../../assets/images/Navbar images/Rectangle 28.png';
import union from '../../assets/images/Navbar images/Union.png';
import user from '../../assets/images/Navbar images/Group 218.svg';

const Navbar = () => {
  return (
    <div className="navbar">
      <div className="logo">
        <img src={logo} alt="logo" />
      </div>
      <div className="options">
        <button>
          <img src={rectangle} alt="bell icon" className="bell-icon" />
        </button>
        <button>
          <img src={union} alt="heart icon" className="heart-icon" />
        </button>
        <button className="user-btn">
          <img src={user} alt="user icon" className="user-icon" />
        </button>
      </div>
    </div>
  );
};

export default Navbar;
