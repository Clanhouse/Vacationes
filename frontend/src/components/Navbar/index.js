import { NavLink } from 'react-router-dom';
import styles from './index.module.scss';
import logo from 'assets/images/navbar/logo-icon.svg';
import bell from 'assets/images/navbar/bell-icon.svg';
import heart from 'assets/images/navbar/heart-icon.svg';
import user from 'assets/images/navbar/user-icon.svg';

const Navbar = () => {
  return (
    <nav className={styles.wrapper}>
      <NavLink to="/" className={styles.logoLink}>
        <img src={logo} alt="logo" />
      </NavLink>

      <div className={styles.options}>
        <NavLink to="/notifications">
          <button>
            <img src={bell} alt="bell icon" className={styles.bellIcon} />
          </button>
        </NavLink>
        <NavLink to="/favorites">
          <button className={styles.heartBtn}>
            <img src={heart} alt="heart icon" />
          </button>
        </NavLink>
        <NavLink to="/login">
          <button className={styles.userBtn}>
            <img src={user} alt="user icon" />
          </button>
        </NavLink>
      </div>
    </nav>
  );
};

export default Navbar;
