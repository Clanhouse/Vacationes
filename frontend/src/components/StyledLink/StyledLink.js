import { Link } from 'react-router-dom';
import styles from './StyledLink.module.scss';

const StyledLink = ({ to, children }) => {
  return (
    <Link className={styles.link} to={to}>
      {children}
    </Link>
  );
};

export default StyledLink;
