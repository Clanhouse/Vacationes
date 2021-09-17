import { NavLink } from 'react-router-dom';
import styles from './index.module.scss';
import logo from 'assets/images/navbar/logo-icon.svg';
import bell from 'assets/images/navbar/bell-icon.svg';
import heart from 'assets/images/navbar/heart-icon.svg';
import user from 'assets/images/navbar/user-icon.svg';

const Navbar = () => {
  return (
    <nav className={styles.wrapper}>
      <button>
        <NavLink to="/">
          <img src={logo} alt="logo" />
        </NavLink>
      </button>
      <div className={styles.options}>
        <button>
          <NavLink to="/notifications">
            <img src={bell} alt="bell icon" className={styles.bellIcon} />
          </NavLink>
        </button>
        <button className={styles.heartBtn}>
          <NavLink to="/favorites">
            <img src={heart} alt="heart icon" />
          </NavLink>
        </button>
        <button className={styles.userBtn}>
          <NavLink to="/login">
            <img src={user} alt="user icon" />
          </NavLink>
        </button>
      </div>
    </nav>
  );
};

export default Navbar;
