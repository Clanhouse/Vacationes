import styles from './index.module.scss';
import logo from 'assets/images/navbar/logo-icon.svg';
import bell from 'assets/images/navbar/bell-icon.svg';
import heart from 'assets/images/navbar/heart-icon.svg';
import user from 'assets/images/navbar/user-icon.svg';

const Navbar = () => {
  return (
    <nav className={styles.wrapper}>
      <div>
        <img src={logo} alt="logo" />
      </div>
      <div className={styles.options}>
        <button>
          <img src={bell} alt="bell icon" className={styles.bellIcon} />
        </button>
        <button className={styles.heartBtn}>
          <img src={heart} alt="heart icon" />
        </button>
        <button className={styles.userBtn}>
          <img src={user} alt="user icon" />
        </button>
      </div>
    </nav>
  );
};

export default Navbar;
