import styles from './SocialAuthButton.module.scss';

const SocialAuthButton = ({ socialIcon, socialName, children }) => {
  return (
    <button className={styles.socialAuthButton}>
      <img src={socialIcon} alt={`${socialName} logo`} />
      <p>{children}</p>
    </button>
  );
};

export default SocialAuthButton;
