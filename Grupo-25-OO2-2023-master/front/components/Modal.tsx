export const Modal = ({
  title,
  children,
  isVisible = false,
  handleClose,
}: {
  title: string;
  children: JSX.Element;
  isVisible: boolean;
  handleClose: () => void;
}) => {
  if (!isVisible) return null;

  const handlePrevent = (e: React.MouseEvent<HTMLDivElement>) => {
    e.stopPropagation();
  };
  return (
    <>
      <dialog
        className="fixed inset-0 z-10 flex items-center justify-center w-full h-full bg-black bg-opacity-50 "
        onClick={handleClose}
      >
        <div
          className="flex flex-col w-full h-fit bg-white rounded-lg p-6 gap-4 md:w-1/2 lg:w-1/4"
          onClick={handlePrevent}
        >
          <h1 className="text-xl font-semibold text-left">{title}</h1>
          {children}
        </div>
      </dialog>
    </>
  );
};
