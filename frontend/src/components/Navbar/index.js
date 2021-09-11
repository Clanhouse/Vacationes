import React from 'react';
import './index.scss';
import logo from 'assets/images/navbar/logo-icon.svg';
import bell from 'assets/images/navbar/bell-icon.svg';
import heart from 'assets/images/navbar/heart-icon.svg';
import user from 'assets/images/navbar/user-icon.svg';

const Navbar = () => {
  return (
    <div className="navbar">
      <div className="logo">
        <img src={logo} alt="logo" />
      </div>
      <div className="options">
        <button>
          <img src={bell} alt="bell icon" className="bell-icon" />
        </button>
        <button>
          <img src={heart} alt="heart icon" className="heart-icon" />
        </button>
        <button className="user-btn">
          <img src={user} alt="user icon" className="user-icon" />
        </button>
      </div>
    </div>
  );
};

export default Navbar;
